package org.example.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerMoveIndex;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;
    private enum GameState {
        IN_PROGRESS,
        ENDED,
        DRAW
    }


}
