package com.example.trw.sampleapi.dao;

import com.google.gson.annotations.SerializedName;

public class Collection {

    @SerializedName("kind")         private String kind;
    @SerializedName("id")           private String id;
    @SerializedName("published")    private String published;
    @SerializedName("name")         private String name;
    @SerializedName("description")  private String description;
    @SerializedName("updated")      private String updated;
    @SerializedName("url")          private String url;
    @SerializedName("selfLink")     private String selfLink;
    @SerializedName("posts")        private Posts posts;
    @SerializedName("pages")        private Pages pages;
    @SerializedName("locale")       private Locale locale;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Pages getPages() {
        return pages;
    }

    public void setPages(Pages pages) {
        this.pages = pages;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

}
