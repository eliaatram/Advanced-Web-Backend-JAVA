package com.example.advancedweb.datamodel;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Movies {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;
    private String title;
    private String author;
    private String type;
    private String overview;
    private String poster;
    private String backdrop_poster;
    private Date release_date;


    public Movies(){}

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

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

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", overview='" + overview + '\'' +
                ", poster='" + poster + '\'' +
                ", backdrop_poster='" + backdrop_poster + '\'' +
                ", release_date=" + release_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movie = (Movies) o;
        return Objects.equals(movie_id, movie.movie_id) && Objects.equals(title, movie.title) && Objects.equals(author, movie.author) && Objects.equals(type, movie.type) && Objects.equals(overview, movie.overview) && Objects.equals(poster, movie.poster) && Objects.equals(backdrop_poster, movie.backdrop_poster) && Objects.equals(release_date, movie.release_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, title, author, type, overview, poster, backdrop_poster, release_date);
    }
}