package ru.netology.radioman;

public class Radio {

    private int currentRadioStation;
    private int numberOfRadioStations = 10;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
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
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }
     public void increaseRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        else currentRadioStation++;
     }

     public void decreaseRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        else currentRadioStation--;
     }

     public int getCurrentRadioStation() {
        return currentRadioStation;
     }

     public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
     }

     public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }



}
