package org.example.models;

import java.util.Scanner;

public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private static Scanner scanner = new Scanner(System.in);

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;

    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move getMove() {
        return null;
    }


    public Move makeMove(Board board, Player player) {
        // ask the player to make a move
        System.out.println(player.name + " Enter the row number to make a move");
        int row = scanner.nextInt();

        System.out.println(player.name + " Enter the column number to make a move");
        int column = scanner.nextInt();

        return new Move(new Cell(row, column), this);
    }
}
