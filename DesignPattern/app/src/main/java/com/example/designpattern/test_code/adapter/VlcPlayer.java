package com.example.designpattern.test_code.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Vlc player play " + fileName + " file");
    }

    @Override
    public void playMP4(String fileName) {

    }
}
