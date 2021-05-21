package fr.sedpower.demineur;

import fr.sedpower.demineur.view.Window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ///// Instantiates a new runnable to call new minesweeper window game
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window window = new Window();
            }
        });
    }
}
