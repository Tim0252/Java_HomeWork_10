package ru.netology;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void TestEmptyList() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestListMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLimitMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestMaxLimitMovie() {
        MovieManager manager = new MovieManager(10);
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestMinLimitMovie() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] expected = {"Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestXLimitMovie() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assert.assertArrayEquals(expected, actual);
    }
}