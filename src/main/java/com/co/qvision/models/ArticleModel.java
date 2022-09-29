package com.co.qvision.models;

import java.util.List;

public class ArticleModel {

    private String title;
    private String about;
    private String article;

    private String tags;

    public ArticleModel(List<String> listArticle) {
        this.title = listArticle.get(0);
        this.about = listArticle.get(1);
        this.article = listArticle.get(2);
        this.tags = listArticle.get(3);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
