package ru.netology.radioman;

public class Radio {

    private int currentRadioStation;
    private int numberOfRadioStations = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setNumberOfRadioStations(int numberOfRadioStations) {
        if (numberOfRadioStations < 0) {
            return;
        }
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = numberOfRadioStations - 1;
        }
        if (currentRadioStation > numberOfRadioStations - 1) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }
     public void increaseRadioStation() {
        if (currentRadioStation < numberOfRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
        }
        else currentRadioStation = 0;
     }

     public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        else currentRadioStation = numberOfRadioStations - 1;
     }

     public int getCurrentRadioStation() {
        return currentRadioStation;
     }

     public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
     }

     public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }



}
