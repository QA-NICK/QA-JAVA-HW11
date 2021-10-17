package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.Movie;

import static org.junit.jupiter.api.Assertions.*;

class movieManagerTest {
    Movie one = new Movie("бладшот", 1);
    Movie two = new Movie("вперед", 2);
    Movie three = new Movie("Отель Белград", 3);
    Movie four = new Movie("джентельмены2", 5);
    Movie five = new Movie("джентельмены3", 6);
    Movie six = new Movie("джентельмены4", 7);
    Movie seven = new Movie("джентельмены5", 8);
    Movie eight = new Movie("джентельмены6", 9);
    Movie nine = new Movie("джентельмены7", 10);
    Movie ten = new Movie("джентельмены8", 11);
    Movie eleven = new Movie("джентельмены9", 12);

    @Test
    public void shouldAddFilm() {
        MovieManager manager = new MovieManager();
//        Movie first = new Movie("бладшот", 1);
        manager.addFilm(one);

        Movie[] actual = manager.showAll();
        Movie[] expected = new Movie[]{one};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldGetAll() {
        MovieManager manager = new MovieManager(2);
//        Movie first = new Movie("бладшот", 1);
//        Movie second = new Movie("вперед", 2);
//        Movie third = new Movie("Отель Белград", 3);
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{three, two};
        assertArrayEquals(actual, expected);


    }

    @Test
    public void shouldGetAll2() {
        MovieManager manager = new MovieManager(4);
//        Movie first = new Movie("бладшот", 1);
//        Movie second = new Movie("вперед", 2);
//        Movie third = new Movie("Отель Белград", 3);
//        Movie forth = new Movie("джентельмены", 4);
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{four, three, two, one};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldGetAll3() {
        MovieManager manager = new MovieManager();
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{eleven,ten, nine, eight, seven, six, five, four, three, two};
        assertArrayEquals(actual, expected);

    }
}