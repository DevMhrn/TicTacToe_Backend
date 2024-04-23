package models;

import enums.PlayerType;

import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cells;


    public static class Player {
        private String name;
        private Symbol symbol;
        private PlayerType playerType;


    }
}
