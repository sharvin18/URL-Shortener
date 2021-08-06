package com.sharvin.URL.Shortener.Models;

import java.time.LocalDateTime;
import java.util.*;
import java.io.*;

public class Response {

    private String originalUrl;
    private String shortUtl;
    private LocalDateTime expiryDate;

    public Response(String originalUrl, String shortUtl, LocalDateTime expiryDate) {
        this.originalUrl = originalUrl;
        this.shortUtl = shortUtl;
        this.expiryDate = expiryDate;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortUtl() {
        return shortUtl;
    }

    public void setShortUtl(String shortUtl) {
        this.shortUtl = shortUtl;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Response{" +
                "originalUrl='" + originalUrl + '\'' +
                ", shortUtl='" + shortUtl + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
