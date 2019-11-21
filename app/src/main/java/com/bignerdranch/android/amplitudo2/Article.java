package com.bignerdranch.android.amplitudo2;

class Article {

    private String title;
    private String description;
    private String image;
    private int type;

    public Article(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.type = 1;
    }

    public Article(String title, String description) {
        this.title = title;
        this.description = description;
        this.image = null;
        this.type = 0;
    }

    public Article(String title) {
        this.title = title;
        this.description = "No description available";
        this.image = null;
        this.type = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
