package org.example.models;

public class Cell {
    private Integer row;
    private Integer column;
    private Player player;
    private CellState state;


    public Cell(Integer row, Integer column) {
        this.row = row;
        this.column = column;
        this.state = CellState.EMPTY;
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
        return this.state == CellState.EMPTY;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public CellState getState() {
        return this.state;
    }
}
