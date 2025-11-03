package com.campusdual.classroom;

public class TVRemote {
    public boolean on = false;
    public int channel = 0;
    public int volume = 0;
    public String color;

    public TVRemote(String color) {
        this.color = color;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.channel > 0) {
            this.channel--;
        }
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public String getColor() {
        return this.color;
    }
}
