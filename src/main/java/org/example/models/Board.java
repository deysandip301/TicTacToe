package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Integer size;
    private List<List<Cell>> cells;

    public Board(Integer size) {
        this.size = size;
        this.cells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell(i, j));
            }
            this.cells.add(row);
        }
    }

    public List<List<Cell>> getCells() {
        return this.cells;
    }

    public Integer getSize() {
        return this.size;
    }

    public Cell getCell(Integer row, Integer column) {
        return this.cells.get(row).get(column);
    }


    public void setCell(Integer row, Integer column, Player player) {
        this.cells.get(row).get(column).setPlayer(player);
    }


    public void printBaord() {
        for(List<Cell> row: this.cells){
            for(Cell cell: row){
                if(cell.getState().equals(CellState.EMPTY)){
                    System.out.print("| -- |");
                }
                else{
                    System.out.print("| " + cell.getPlayer().getSymbol().getCharacter() + " |");
                }
            }
            System.out.println();
        }
    }

    public Board getBoard() {
        return this;
    }
}
