package ru.netology.domain;

public class Post {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSaveToBookmarks() {
        return saveToBookmarks;
    }

    public void setSaveToBookmarks(boolean saveToBookmarks) {
        this.saveToBookmarks = saveToBookmarks;
    }

    public String getOpenToReadButton() {
        return openToReadButton;
    }

    public void setOpenToReadButton(String openToReadButton) {
        this.openToReadButton = openToReadButton;
    }

    public int getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(int publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getAuthorPost() {
        return authorPost;
    }

    public void setAuthorPost(String authorPost) {
        this.authorPost = authorPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private int id;
    private String title;
    private String subtitle;
    private String description;
    private boolean saveToBookmarks;
    private String openToReadButton;
    private int publicationTime;
    private String authorPost;
    private String text;

    // + get/set на все поля



}
