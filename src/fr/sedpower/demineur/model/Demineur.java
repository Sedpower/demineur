package fr.sedpower.demineur.model;

public class Demineur {

    public enum Dificulty {EASY, MEDIUM, HARD}

    private Case[][] grid;

    public Demineur(Dificulty dificulty) {
        switch (dificulty) {
            case EASY -> {
                grid = new Case[10][10]; //10B
            }
            case MEDIUM -> {
                grid = new Case[18][18]; //40B
            }
            case HARD -> {
                grid = new Case[24][24]; //100B
            }
        }
    }
}
