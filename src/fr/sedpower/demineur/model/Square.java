package fr.sedpower.demineur.model;

import javax.swing.*;

/**
 * @author Sedpower
 * @version 1.0
 */

public class Square extends JButton {

    public enum Pos {CENTERED, TOP, LEFT, BOTTOM, RIGHT, RIGHT_TOP_CORNER, LEFT_TOP_CORNER, RIGHT_BOTTOM_CORNER, LEFT_BOTTOM_CORNER}

    private int ord, abs;
    private boolean isMined;
    private Pos pos;

    /**
     * Create a new minesweeper square at given coordinates
     * @param ord Abscissa of the square in the minesweeper grid
     * @param abs Ordinate of the square in the minesweeper grid
     */
    public Square(int ord, int abs, Pos pos) {
        this.ord = ord;
        this.abs = abs;
        this.pos = pos;
        this.isMined = false;
    }

    /**
     * Give the information if this square contains a mine
     * @return true if there is a mine, false otherwise
     */
    public boolean isMined() {
        return isMined;
    }

    /**
     * Place a mine on the square
     */
    public void setMined() {
        isMined = true;
    }
}