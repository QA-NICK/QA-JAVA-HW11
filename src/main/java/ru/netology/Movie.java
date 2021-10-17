package ru.netology;

public class Movie {

    private String movie;
    private int id;

    public Movie() {
    }

    public Movie(String movie, int id) {
        this.movie = movie;
        this.id = id;

    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
