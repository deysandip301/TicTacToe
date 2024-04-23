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
}
