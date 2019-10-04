package ru.mirea.lab1;

public class Ball {
    private String color;
    private String game;
    private double diameter;

    public Ball(String r, double i, String m) {
        this.color = r;
        this.game = m;
        this.diameter = i;
    }

    public Ball(String r, String m) {
        this.color = r;
        this.game = m;
        this.diameter = 0.0D;
    }

    public Ball(String r) {
        this.color = r;
        this.game = "Game";
        this.diameter = 0.0D;
    }

    public Ball() {
        this.color = "Multicolored";
        this.game = "Game";
        this.diameter = 0.0D;

    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getColor(String color) {
        return color;
    }

    public String getGame(String game) {
        return game;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public String toString() {
        return this.color + " color, " + " game " + this.game + ", diameter " + this.diameter;
    }
}
