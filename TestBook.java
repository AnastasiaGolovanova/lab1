package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("One Flew Over the Cuckoo's Nest", "roman", 382);
        Book b2 = new Book("Chocolat", "roman", 399);
        Book b3 = new Book("Snomannen", "detective", 478);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}