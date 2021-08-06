package com.sharvin.URL.Shortener.Models;

import java.util.*;
import java.io.*;

public class UrlData {

    private String url;
    private String expirationDate;

    public UrlData(String url, String expiryDate){
        this.url = url;
        this.expirationDate = expiryDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "UrlData{" +
                "url='" + url + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
