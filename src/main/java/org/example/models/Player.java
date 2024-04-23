package org.example.models;

public class Player {
    private String name;
    private Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    private enum PlayerType {
        HUMAN,
        COMPUTER
    }
    private PlayerType playerType;


}
