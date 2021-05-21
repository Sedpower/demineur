package fr.sedpower.demineur.view;

import fr.sedpower.demineur.model.MineSweeper;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private JPanel principal, easyGrid, mediumGrid, hardGrid, info;
    private MineSweeper mineSweeper;

    public Window() {
        super("Démineur");

        /////////// Initialisation of medium grid created by default when opening game ///////////
        mediumGrid = new JPanel(new GridLayout(18, 18));
        mineSweeper = new MineSweeper(MineSweeper.Dificulty.MEDIUM, this);
    }
}
