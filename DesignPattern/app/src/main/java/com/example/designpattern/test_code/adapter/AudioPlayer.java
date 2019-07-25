package com.example.designpattern.test_code.adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equals("mp3")) {
            System.out.println("Audio player play" + fileName + " file");
        } else if (mediaType.equals("vlc") || mediaType.equals("mp4")) {
            MediaAdapter adapter = new MediaAdapter(mediaType);
            adapter.play(mediaType, fileName);
        } else {
            System.out.println(mediaType + " is audio player not supported!!!");
        }
    }
}
