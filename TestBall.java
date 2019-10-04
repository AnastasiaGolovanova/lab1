package ru.mirea.lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("yellow", 22.2, "volleyball");
        Ball b2 = new Ball("orange", 23.4, "basketball");
        Ball b3 = new Ball("white",  23.4, "football" );
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
