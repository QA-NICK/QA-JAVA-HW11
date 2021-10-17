package ru.netology.manager;

import ru.netology.Movie;

public class MovieManager {
    private int limit = 10;
    private Movie[] movies = new Movie[0];

    public MovieManager() {
    }

    ;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(Movie String) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = String;
        movies = tmp;

    }

    public Movie[] showAll() {
        return movies;
    }

    public Movie[] getAll() {
        Movie[] movies = showAll();
        int resultLength;
        if (movies.length > limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }


        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}
