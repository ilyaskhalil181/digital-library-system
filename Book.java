package com.mycompany.digitallibrary;

public class Book extends MediaItem {
    private String ISBN;

    public Book(String title, String author, Tag[] tags, String ISBN) {
        super(title, author, tags);
        this.ISBN = ISBN;
    }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    @Override
    public void displayInfo() {
        System.out.println("--- Book ---");
        super.displayInfo();
        System.out.println("ISBN   : " + ISBN);
        System.out.println();
    }
}