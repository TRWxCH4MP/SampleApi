package com.example.trw.sampleapi.dao;

import com.google.gson.annotations.SerializedName;

public class Pages {

    @SerializedName("totalItems")
    private Integer totalItems;
    @SerializedName("selfLink")
    private String selfLink;

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

}
