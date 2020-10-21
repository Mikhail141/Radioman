package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radioman radioman = new Radioman();

    @Test
    void getNumberstation() {
        int maxstation = 10;
        int minstation = 0;
        radioman.setCurrentNumberstation(3);
        assertEquals(3,radioman.getCurrentNumberstation());
    }

    @Test
    void getSound() {
        int maxsound = 100;
        int minsound = 0;
        radioman.setCurrentSound(100);
        assertEquals(100,radioman.getCurrentSound());
    }


    @Test
    void increaseCurrentNumberstationMax() {
        radioman.setCurrentNumberstation(10);
        radioman.increaseCurrentNumberstation();
        assertEquals(0,radioman.getCurrentNumberstation());

    }

    @Test
    void increaseCurrentNumberstation() {
        radioman.setCurrentNumberstation(0);
        radioman.increaseCurrentNumberstation();
        assertEquals(1,radioman.getCurrentNumberstation());
    }

    @Test
    void decreaseCurrentNumberstationMin() {
        radioman.setCurrentNumberstation(0);
        radioman.decreaseCurrentNumberstation();
        assertEquals(10,radioman.getCurrentNumberstation());
    }

    @Test
    void decreaseCurrentNumberstation(){
        radioman.setCurrentNumberstation(8);
        radioman.decreaseCurrentNumberstation();
        assertEquals(7,radioman.getCurrentNumberstation());
    }

    @Test
    void increaseCurrentSoundMax() {
        radioman.setCurrentSound(100);
        radioman.increaseCurrentSound();
        assertEquals(100,radioman.getCurrentSound());
    }

    @Test
    void increaseCurrentSound(){
        radioman.setCurrentSound(7);
        radioman.increaseCurrentSound();
        assertEquals(8,radioman.getCurrentSound());
    }

    @Test
    void decreaseCurrentSoundMin() {
        radioman.setCurrentSound(0);
        radioman.decreaseCurrentSound();
        assertEquals(0,radioman.getCurrentSound());
    }
    @Test
    void decreaseCurrentSound(){
        radioman.setCurrentSound(8);
        radioman.decreaseCurrentSound();
        assertEquals(7,radioman.getCurrentSound());
    }
}