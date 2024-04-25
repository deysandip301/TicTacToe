package org.example.models;

import java.util.List;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotDifficultyLevel getBotDifficultyLevel() {
        return this.botDifficultyLevel;
    }
    private void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public Bot(String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move getMove() {
        return null;
    }

    @Override
    public Move makeMove(Board board, Player player) {
        // find the first empty cell and make a move
        for (List<Cell> row : board.getCells()) {
            for (Cell cell : row) {
                if (cell.isEmpty()) {
                    return new Move(cell, this);
                }
            }
        }
        return null;
    }

}
