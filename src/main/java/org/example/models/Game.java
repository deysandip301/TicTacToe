package org.example.models;

import org.example.exceptions.InvalidMoveException;
import org.example.stratergy.WinningAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerMoveIndex;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;
    private WinningAlgorithm winningAlgorithm ;


    public Game(int dimension, List<Player> players) {
        this.board = new Board(dimension);
        this.players = players;
        this.nextPlayerMoveIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.winningAlgorithm = new WinningAlgorithm(dimension);
    }

    public void printBoard(Game game) {
        game.board.printBaord();
    }

    public Player getWinner() {
        return this.winner;
    }

    public GameState getGameState() {
        return this.gameState;
    }

    public boolean validateMove(Move move) {
        Integer row = move.getCell().getRow();
        Integer column = move.getCell().getColumn();
        if(row < 0 || row >= this.board.getSize() || column < 0 || column >= this.board.getSize()) {

        }

        return this.board.getBoard().getCells().get(row).get(column).getState().equals(CellState.EMPTY);
    }

    public void makeMove(Game game) throws InvalidMoveException{
        Player currentPlayer = game.players.get(game.nextPlayerMoveIndex);
        Move move = currentPlayer.makeMove(game.board,currentPlayer);
        // validate the move  before executing
        if(!validateMove(move)) {
            throw new InvalidMoveException("Invalid Move made by the " + currentPlayer.getName());
        }

        // print's the player's move
        System.out.println(currentPlayer.getName() + " made a move at " + move.getCell().getRow() + " " + move.getCell().getColumn());

        int row = move.getCell().getRow();
        int column = move.getCell().getColumn();
        Cell cellToChange = game.board.getCells().get(row).get(column);
        cellToChange.setState(CellState.FILLED);
        cellToChange.setPlayer(currentPlayer);
        game.moves.add(move);

        // check if the current move is winning move or not
        if(game.winningAlgorithm.checkWinningCondition(game.board, move)) {
            game.winner = currentPlayer;
            game.gameState = GameState.ENDED;
        }
        else if(game.moves.size() == game.board.getSize() * game.board.getSize()) {
            game.gameState = GameState.DRAW;
        }

        game.nextPlayerMoveIndex = (game.nextPlayerMoveIndex + 1) % game.players.size();
    }
}
