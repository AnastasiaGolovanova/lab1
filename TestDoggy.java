package ru.mirea.lab1;

public class TestDoggy {
    public TestDoggy() {
    }

    public static void main(String[] args) {
        Doggy d1 = new Doggy("Mike", 2, 16.2);
        Doggy d2 = new Doggy("Helen", 7, 22.9);
        Doggy d3 = new Doggy("Bob", 5);
        d3.setGrowth(19.6);
        System.out.println(d1);
        d1.intoHumanAge();
        System.out.println(d2);
        d2.intoHumanAge();
        System.out.println(d3);
        d3.intoHumanAge();
    }
}
