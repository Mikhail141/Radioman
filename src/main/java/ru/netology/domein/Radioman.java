package ru.netology.domein;

public class Radioman {
    private int numberstation;
    private int minstation;
    private int maxstation;

    private int sound;
    private int minsound;
    private int maxsound;

    public int getNumberstation() {

        return numberstation;
    }

    public void setNumberstation(int numberstation) {
        if (numberstation > maxstation) {
            return;
        }
        if (numberstation < minstation) {
            return;
        }
        this.numberstation = numberstation;
    }

    public int getMinstation() {

        return minstation;
    }

    public void setMinstation(int minstation) {

        this.minstation = minstation;
    }

    public int getMaxstation() {

        return maxstation;
    }

    public void setMaxstation(int maxstation) {

        this.maxstation = maxstation;
    }

    public int getSound() {

        return sound;
    }

    public void setSound(int sound) {
        if (sound > maxsound) {
            return;
        }
        if (sound < minsound) {
            return;
        }
        this.sound = sound;
    }

    public int getMinsound() {
        return minsound;
    }

    public void setMinsound(int minsound) {
        this.minsound = minsound;
    }

    public int getMaxsound() {
        return maxsound;
    }

    public void setMaxsound(int maxsound) {
        this.maxsound = maxsound;
    }
}
