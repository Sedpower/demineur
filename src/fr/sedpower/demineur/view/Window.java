package fr.sedpower.demineur.view;

import fr.sedpower.demineur.controller.SquareController;
import fr.sedpower.demineur.model.MineSweeper;
import fr.sedpower.demineur.model.Square;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private JPanel principal, easyGrid, mediumGrid, hardGrid, info;
    private MineSweeper mineSweeper;
    private SquareController controller;

    /**
     * Create new window for the view
     */
    public Window() {
        super("Démineur");
        setResizable(false);
        setSize(new Dimension(600, 650));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        ///// Initialisation of the principal panel
        principal = new JPanel(new BorderLayout());
        add(principal);

        /////////// Initialisation of medium grid created by default when opening game ///////////
        mediumGrid = new JPanel(new GridLayout(18, 18));
        mineSweeper = new MineSweeper(MineSweeper.Dificulty.MEDIUM, this);

        ///// Create new controller to listen all minesweeper square
        controller = new SquareController(this, mineSweeper);

        ///// Initialisation of the game view
        principal.add(mediumGrid, BorderLayout.CENTER);

        info = new JPanel(new GridLayout(1, 1));
        info.setPreferredSize(new Dimension(600, 50));
        info.add(new JLabel("test", SwingConstants.CENTER));
        principal.add(info, BorderLayout.NORTH);


        setVisible(true);
    }

    public void setSquareController(Square square) {
        square.addMouseListener(controller);
        square.addActionListener(controller);
    }

    public void addSquare(Square square) {
        mediumGrid.add(square);
    }
}
