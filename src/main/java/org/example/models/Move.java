package org.example.models;

public class Move {
    private Cell cell;
    private Player player;

    public Move(Cell cell, Player player) {
        this.cell = cell;
        this.player = player;
    }
    // getter ans setter
    public Cell getCell() {
        return this.cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Integer getRow() {
        return this.cell.getRow();
    }

    public Integer getColumn() {
        return this.cell.getColumn();
    }
}
