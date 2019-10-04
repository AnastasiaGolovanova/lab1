package ru.mirea.lab1;

public class Doggy {
    private String name;
    private int age;
    private double growth;

    public Doggy(String n, int a, double g) {
        this.name = n;
        this.age = a;
        this.growth = g;
    }

    public Doggy(String n, int a) {
        this.name = n;
        this.age = a;
        this.growth = 0.0D;
    }

    public Doggy(String n) {
        this.name = n;
        this.age = 0;
        this.growth = 0.0D;
    }

    public Doggy() {
        this.name = "Pup";
        this.age = 0;
        this.growth = 0.0D;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public String getName(String name) {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGrowth() {
        return this.growth;
    }

    public String toString() {
        return this.name + ", age " + this.age + ", growth " + this.growth;
    }

    public void intoHumanAge() {
        System.out.println(this.name + "'s age in human years is " + this.age * 7 + " years");
    }
}
