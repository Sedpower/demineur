package fr.sedpower.demineur.controller;

import fr.sedpower.demineur.model.MineSweeper;
import fr.sedpower.demineur.view.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SquareController implements ActionListener, MouseListener {

    private Window window;
    private MineSweeper mineSweeper;

    /**
     * Create a new controller for minesweeper grid square
     * @param window The view
     * @param mineSweeper The model
     */
    public SquareController(Window window, MineSweeper mineSweeper) {
        this.window = window;
        this.mineSweeper = mineSweeper;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
