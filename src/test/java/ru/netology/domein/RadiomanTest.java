package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void getNumberstationAndsetNumberstation() {
        Radioman radioman = new Radioman();

        radioman.setMinstation(0);
        radioman.setMaxstation(9);
        radioman.setNumberstation(3);
        assertEquals(3,radioman.getNumberstation());

    }

    @Test
    void getMinstationAndsetMinstation() {
        Radioman radioman = new Radioman();
        radioman.setMinstation(0);
        assertEquals(0,radioman.getMinstation());
    }

    @Test
    void getMaxstationsetMaxstation() {
        Radioman radioman = new Radioman();
        radioman.setMaxstation(9);
        assertEquals(9,radioman.getMaxstation());
    }

    @Test
    void getSoundAndsetSound() {
        Radioman radioman = new Radioman();
        radioman.setMinsound(0);
        radioman.setMaxsound(10);

        radioman.setSound(5);
        assertEquals(5,radioman.getSound());
    }

    @Test
    void getMinsoundAndsetMinsound() {
        Radioman radioman = new Radioman();
        radioman.setMinsound(0);
        assertEquals(0,radioman.getMinsound());
    }

    @Test
    void getMaxsound() {
        Radioman radioman = new Radioman();
        radioman.setMaxsound(10);
        assertEquals(10,radioman.getMaxsound());
    }

    @Test
    void setNumberstation() {
        Radioman radioman = new Radioman();
        radioman.setMaxstation(9);
        radioman.setMinstation(0);
        radioman.setNumberstation(10);
        assertEquals(0,radioman.getMinstation());

        radioman.setMaxstation(9);
        radioman.setMinstation(0);
        radioman.setNumberstation(-1);
        assertEquals(9,radioman.getMaxstation());

        radioman.setMinstation(0);
        radioman.setNumberstation(-1);
        assertEquals(0,radioman.getMinstation());



    }

    @Test
    void setSound() {
        Radioman radioman = new Radioman();
        radioman.setMaxsound(10);
        radioman.setSound(11);
        assertEquals(10,radioman.getMaxsound());

        radioman.setMinsound(0);
        radioman.setSound(-1);
        assertEquals(0,radioman.getSound());
    }
}