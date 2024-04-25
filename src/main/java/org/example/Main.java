package org.example;

import org.example.controller.GameController;
import org.example.exceptions.InvalidMoveException;
import org.example.models.*;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        System.out.println("Hello, World!");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the dimension of the board");
//        int dimension = scanner.nextInt();

        GameController gameController = new GameController();

        int dimension = 3;
        Player player1 = new Player("Deepak Sir", new Symbol('X'));
        Player player2 = new Bot("BOT", new Symbol('O'), BotDifficultyLevel.EASY);

        List<Player> players = List.of(player1, player2);

        Game game = gameController.startGame(dimension, players);

        while(game.getGameState().equals(GameState.IN_PROGRESS)) {
            try {
                // 1. print the board
                gameController.printBoard(game);

                // 2. player's turn
                gameController.makeMove(game);
            }
            catch (InvalidMoveException e) {
                System.out.println(e.getMessage());
            }
        }

        if(gameController.checkState(game).equals(GameState.ENDED)) {
            gameController.printBoard(game);
            System.out.println("The winner is " + gameController.getWinner(game).getName());
        }
        else if(gameController.checkState(game).equals(GameState.DRAW)) {
            gameController.printBoard(game);
            System.out.println("The game is a draw");
        }
    }
}