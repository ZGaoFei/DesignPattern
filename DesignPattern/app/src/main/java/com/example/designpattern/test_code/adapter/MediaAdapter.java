package com.example.designpattern.test_code.adapter;

/**
 * 在不改变原有接口实现的情况下，扩展其功能
 *
 * 例：AudioPlayer只能播放MP3格式数据，通过MediaAdapter扩展其可以播放vlc和mp4格式的视频
 */
public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer player;

    public MediaAdapter(String mediaType) {
        if (mediaType.equals("vlc")) {
            player = new VlcPlayer();
        } else if (mediaType.equals("mp4")) {
            player = new MP4Player();
        }
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equals("vlc")) {
            player.playVLC(fileName);
        } else if (mediaType.equals("mp4")) {
            player.playMP4(fileName);
        }
    }
}
