package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void getNumberstation() {
        Radioman radioman = new Radioman();
        int maxstation = 10;
        int minstation = 0;

        radioman.setCurrentNumberstation(3);
        assertEquals(3,radioman.getCurrentNumberstation());

    }

    @Test
    void getSound() {
        Radioman radioman = new Radioman();

        int maxsound = 100;
        int minsound = 0;

        radioman.setCurrentSound(100);
        assertEquals(100,radioman.getCurrentSound());
    }


    @Test
    void increaseCurrentNumberstation() {
        Radioman radioman = new Radioman();

        radioman.setCurrentNumberstation(10);
        radioman.increaseCurrentNumberstation();
        assertEquals(0,radioman.getCurrentNumberstation());

        radioman.setCurrentNumberstation(0);
        radioman.increaseCurrentNumberstation();
        assertEquals(1,radioman.getCurrentNumberstation());

    }

    @Test
    void decreaseCurrentNumberstation() {
        Radioman radioman = new Radioman();

        radioman.setCurrentNumberstation(0);
        radioman.decreaseCurrentNumberstation();
        assertEquals(10,radioman.getCurrentNumberstation());

        radioman.setCurrentNumberstation(8);
        radioman.decreaseCurrentNumberstation();
        assertEquals(7,radioman.getCurrentNumberstation());
    }

    @Test
    void increaseCurrentSound() {
        Radioman radioman = new Radioman();

        radioman.setCurrentSound(100);
        radioman.increaseCurrentSound();
        assertEquals(100,radioman.getCurrentSound());

        radioman.setCurrentSound(7);
        radioman.increaseCurrentSound();
        assertEquals(8,radioman.getCurrentSound());
    }

    @Test
    void decreaseCurrentSound() {
        Radioman radioman = new Radioman();

        radioman.setCurrentSound(0);
        radioman.decreaseCurrentSound();
        assertEquals(0,radioman.getCurrentSound());

        radioman.setCurrentSound(8);
        radioman.decreaseCurrentSound();
        assertEquals(7,radioman.getCurrentSound());
    }
}