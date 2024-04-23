package models;

import enums.GameState;

import java.util.List;

public class Game {
    private Board Board;
    private List<models.Board.Player> players;
    private int nextPlayerMoveIndex;
    private models.Board.Player winner;
    private List<Move> move;
    private GameState gameState;



}
