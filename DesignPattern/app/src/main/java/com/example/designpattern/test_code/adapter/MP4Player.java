package com.example.designpattern.test_code.adapter;

public class MP4Player implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("MP4 player play " + fileName + " file");
    }
}
