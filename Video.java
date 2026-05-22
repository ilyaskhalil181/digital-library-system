package com.mycompany.digitallibrary;

public class Video extends MediaItem {
    private int duration;

    public Video(String title, String author, Tag[] tags, int duration) {
        super(title, author, tags);
        this.duration = duration;
    }

    public int getDuration() { return duration; }

    @Override
    public void displayInfo() {
        System.out.println("--- Video ---");
        super.displayInfo();
        System.out.println("Duration: " + duration + " mins");
        System.out.println();
    }
}