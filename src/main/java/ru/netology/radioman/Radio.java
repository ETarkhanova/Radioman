package ru.netology.radioman;

public class Radio {

    public int currentRadioStation;
    public int setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return 0;
        }
        if (newCurrentRadioStation > 0) {
            currentRadioStation = newCurrentRadioStation;
        }
        if (newCurrentRadioStation <= 9) {
            currentRadioStation = newCurrentRadioStation;
        }
        return currentRadioStation;
    }
        public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int currentVolume;
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }
    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }
}
