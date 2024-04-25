package org.example.stratergy;

import org.example.models.Board;
import org.example.models.Move;

import java.util.HashMap;

public class WinningAlgorithm {
    HashMap<Integer,HashMap<Character , Integer>> rowMaps;
    HashMap<Integer,HashMap<Character , Integer>> columnMaps;
    HashMap<Character,Integer> principalDiagonalMap;
    HashMap<Character,Integer> secondaryDiagonalMap;

    public WinningAlgorithm(int size){
        rowMaps = new HashMap<>();
        columnMaps = new HashMap<>();
        principalDiagonalMap = new HashMap<>();
        secondaryDiagonalMap = new HashMap<>();
        for(int i=0;i<size;i++){
            rowMaps.put(i,new HashMap<>());
            columnMaps.put(i,new HashMap<>());
        }
    }

    public boolean checkWinningCondition(Board board, Move move) {
        int row = move.getCell().getRow();
        int column = move.getCell().getColumn();
        Character symbol = move.getPlayer().getSymbol().getCharacter();
        rowMaps.get(row).put(symbol,rowMaps.get(row).getOrDefault(symbol,0)+1);

        columnMaps.get(column).put(symbol,columnMaps.get(column).getOrDefault(symbol,0)+1);

        if(row == column){
            principalDiagonalMap.put(symbol,principalDiagonalMap.getOrDefault(symbol,0)+1);
        }

        if(row+column == board.getSize()-1){
            secondaryDiagonalMap.put(symbol,secondaryDiagonalMap.getOrDefault(symbol,0)+1);
        }

        if(rowMaps.get(row).get(symbol) == board.getSize() || columnMaps.get(column).get(symbol) == board.getSize() || principalDiagonalMap.get(symbol) == board.getSize() || secondaryDiagonalMap.get(symbol) == board.getSize()){
            return true;
        }
        return false;
    }
}
