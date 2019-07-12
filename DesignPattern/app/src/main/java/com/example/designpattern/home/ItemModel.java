package com.example.designpattern.home;

public class ItemModel {
    private String title;
    private String url;
    private String gitUrl;
    private int type;

    public ItemModel(String title, String url, String gitUrl, int type) {
        this.title = title;
        this.url = url;
        this.gitUrl = gitUrl;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
