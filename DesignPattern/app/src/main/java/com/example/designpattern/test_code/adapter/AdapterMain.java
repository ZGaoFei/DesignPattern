package com.example.designpattern.test_code.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "hahaha.mp3");
        audioPlayer.play("vlc", "hehehe.vlc");
        audioPlayer.play("mp4", "enenen.mp4");
        audioPlayer.play("avi", "hengheng.avi");
    }
}
