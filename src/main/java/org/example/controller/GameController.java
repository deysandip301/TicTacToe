package org.example.controller;

import org.example.exceptions.InvalidMoveException;
import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        // validate if two players have the same symbol or not and throw an exception if they do
        Set<Character> uniqueSymbols = new HashSet<>();

        return new Game(dimension, players);
    }

    public void makeMove(Game game, Player player, int row, int column) {
        // validate if the move is valid or not and throw an exception if it is not
    }

    public GameState checkState(Game game) {
        // check if the game is won or drawn or in progress
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard(game);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove(game);
    }
}
