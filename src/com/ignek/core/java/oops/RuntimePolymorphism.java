package com.ignek.core.java.oops;

class MediaFile{
    void play(){
        System.out.println("Playing..");
    }
}

class AudioFile extends MediaFile{
    void play(){
        System.out.println("Audio playing..");
    }
}

class VideoFile extends MediaFile{
    void play(){
        System.out.println("Video playing..");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        MediaFile mediaFile1 = new MediaFile();
        AudioFile audioFile1 = new AudioFile();
        VideoFile videoFile1 = new VideoFile();

        mediaFile1.play();
        audioFile1.play();
        videoFile1.play();
    }
}
