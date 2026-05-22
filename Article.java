package com.mycompany.digitallibrary;

public class Article extends MediaItem {
    private String journal;

    public Article(String title, String author, Tag[] tags, String journal) {
        super(title, author, tags);
        this.journal = journal;
    }

    public String getJournal() { return journal; }

    @Override
    public void displayInfo() {
        System.out.println("--- Article ---");
        super.displayInfo();
        System.out.println("Journal: " + journal);
        System.out.println();
    }
}