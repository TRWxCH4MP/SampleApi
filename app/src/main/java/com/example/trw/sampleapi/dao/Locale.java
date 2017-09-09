package com.example.trw.sampleapi.dao;

import com.google.gson.annotations.SerializedName;

public class Locale {

    @SerializedName("language")
    private String language;
    @SerializedName("country")
    private String country;
    @SerializedName("variant")
    private String variant;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }
}
