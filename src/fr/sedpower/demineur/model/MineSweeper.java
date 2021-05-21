package fr.sedpower.demineur.model;

import fr.sedpower.demineur.controller.SquareController;
import fr.sedpower.demineur.view.Window;

public class MineSweeper {

    public enum Dificulty {EASY, MEDIUM, HARD}

    private Square[][] grid;
    private int minesNb;
    private boolean isBlank;

    /**
     * Create a new model for the game
     * @param difficulty The difficulty of the game
     * @param window The view
     */
    public MineSweeper(Dificulty difficulty, Window window) {
        ///// Generate new grid following difficulty parameter given
        isBlank = true;
        switch (difficulty) {
            case EASY -> {
                grid = new Square[10][10];
                minesNb = 10;
            }
            case MEDIUM -> {
                grid = new Square[18][18];
                minesNb = 40;
            }
            case HARD -> {
                grid = new Square[24][24];
                minesNb = 100;
            }
        }

        ///// Fill in the grid with non occupied square and set the position value in relation to the edges
        Square tmpSquare;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        tmpSquare = new Square(i, j, Square.Pos.LEFT_TOP_CORNER);
                    } else if (j == grid.length-1) {
                        tmpSquare = new Square(i, j, Square.Pos.RIGHT_TOP_CORNER);
                    } else {
                        tmpSquare = new Square(i, j, Square.Pos.TOP);
                    }
                } else if (i == grid.length-1) {
                    if (j == 0) {
                        tmpSquare = new Square(i, j, Square.Pos.LEFT_BOTTOM_CORNER);
                    } else if (j == grid.length-1) {
                        tmpSquare = new Square(i, j, Square.Pos.RIGHT_BOTTOM_CORNER);
                    } else {
                        tmpSquare = new Square(i, j, Square.Pos.BOTTOM);
                    }
                } else if (j == 0) {
                    tmpSquare = new Square(i, j, Square.Pos.LEFT);
                } else if (j == grid.length-1) {
                    tmpSquare = new Square(i, j, Square.Pos.RIGHT);
                } else {
                    tmpSquare = new Square(i, j, Square.Pos.CENTERED);
                }
                window.setSquareController(tmpSquare);
                window.addSquare(tmpSquare);
                grid[i][j] = tmpSquare;
            }
        }

        ///// Define random mined squares

    }

    public boolean isBlank() {
        return isBlank;
    }
}
