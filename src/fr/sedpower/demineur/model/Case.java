package fr.sedpower.demineur.model;

import javax.swing.*;

public class Case extends JButton {

    private int ord, abs;

    public Case(int ord, int abs) {
        this.ord = ord;
        this.abs = abs;
    }
}