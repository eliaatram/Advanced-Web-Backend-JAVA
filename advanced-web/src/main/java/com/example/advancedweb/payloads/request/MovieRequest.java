package com.example.advancedweb.payloads.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class MovieRequest {

    @NotBlank
    @NotNull
    private String title;
    @NotBlank
    @NotNull
    private String author;
    @NotBlank
    @NotNull
    private String type;
    @NotBlank
    @NotNull
    private String overview;
    @NotBlank
    @NotNull
    private String poster;
    @NotBlank
    @NotNull
    private String backdrop_poster;
    @NotBlank
    @NotNull
    private Date release_date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getBackdrop_poster() {
        return backdrop_poster;
    }

    public void setBackdrop_poster(String backdrop_poster) {
        this.backdrop_poster = backdrop_poster;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
}
