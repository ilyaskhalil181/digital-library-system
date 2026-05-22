package com.mycompany.digitallibrary;

public class DigitalLibrary {
    public static void main(String[] args) {

        Tag t1 = new Tag("Science");
        Tag t2 = new Tag("History");
        Tag t3 = new Tag("Technology");

        Book book = new Book(
            "A Brief History of Time",
            "Stephen Hawking",
            new Tag[]{ t1, t2 },
            "ISBN-978-0553380163"
        );

        Video video = new Video(
            "Introduction to Neural Networks",
            "Andrew Ng",
            new Tag[]{ t1, t3 },
            45
        );

        Article article = new Article(
            "Quantum Computing: Future Prospects",
            "Dr. Preskill",
            new Tag[]{ t1, t3 },
            "Nature Physics Journal"
        );

        MediaItem[] library = new MediaItem[3];
        library[0] = book;
        library[1] = video;
        library[2] = article;

        System.out.println("===== DIGITAL LIBRARY CATALOG =====");
        for (int i = 0; i < library.length; i++) {
            library[i].displayInfo();
        }
    }
}