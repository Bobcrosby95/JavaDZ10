package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void findAll() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек - невидимка");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек - невидимка"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast1() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек - невидимка");

        String[] actual = manager.findLast();
        String[] expected = {"Человек - невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек - невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель Белград"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
