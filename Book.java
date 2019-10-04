package ru.mirea.lab1;

public class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String t, String g, int p) {
        this.title = t;
        this.genre = g;
        this.pages = p;
    }

    public Book(String t, String g) {
        this.title = t;
        this.genre = g;
        this.pages = 0;
    }

    public Book(String t) {
        this.title = t;
        this.genre = "Text";
        this.pages = 0;
    }

    public Book() {
        this.title = "Text";
        this.genre = "Text";
        this.pages = 0;

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle(String title) {
        return title;
    }

    public int getPages() {
        return this.pages;
    }

    public String getGenre(String genre) {
        return genre;
    }

    public String toString() {
        return this.title + ", genre - " + this.genre + ", pages " + this.pages;
    }
}
