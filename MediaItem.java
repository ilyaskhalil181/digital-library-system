package com.mycompany.digitallibrary;

public class MediaItem {
    private String title;
    private String author;
    private Tag[] tags;

    public MediaItem(String title, String author, Tag[] tags) {
        this.title  = title;
        this.author = author;
        this.tags   = tags;
    }

    public String getTitle()  { return title;  }
    public String getAuthor() { return author; }
    public Tag[]  getTags()   { return tags;   }

    public void displayInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.print(  "Tags   : ");
        for (Tag t : tags) {
            System.out.print(t.getTagName() + "  ");
        }
        System.out.println();
    }
}