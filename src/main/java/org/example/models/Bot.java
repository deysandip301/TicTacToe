package org.example.models;

public class Bot extends Player {
    private enum BotDifficultyLevel {
        EASY,
        MEDIUM,
        HARD
    }
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
}
