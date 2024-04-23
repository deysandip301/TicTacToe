package org.example.models;

public class Cell {
    private Integer row;
    private Integer column;
    private Player player;
    private cellState state;
    private enum cellState {
        EMPTY,
        FILLED
    }


    public Cell(Integer row, Integer column) {
        this.row = row;
        this.column = column;
        this.player = null;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Integer getRow() {
        return this.row;
    }

    public Integer getColumn() {
        return this.column;
    }

    public Boolean isEmpty() {
        return this.state == cellState.EMPTY;
    }
}
