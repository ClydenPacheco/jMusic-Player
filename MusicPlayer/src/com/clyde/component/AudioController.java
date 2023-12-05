package com.clyde.component;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AudioController {
    
    private static Clip clip;
    private long clipTimePosition; // To store the current position of the clip
    private List<String> playlist;
    private int currentIndex;
    
    public AudioController() {
        playlist = new ArrayList<>();
        currentIndex = -1; // Initialize the current index
    }
    
    public void addToPlaylist(String filePath) {
        playlist.add(filePath);
    }

    public void playAudio(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);

            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    
     public void playNext() {
        if (!playlist.isEmpty()) {
            if (currentIndex < playlist.size() - 1) {
                currentIndex++;
                playAudio(playlist.get(currentIndex));
            } else {
                currentIndex = 0; // Wrap around to the beginning of the playlist
                playAudio(playlist.get(currentIndex));
            }
        }
    }
     
    public void playPrevious() {
        if (!playlist.isEmpty()) {
            if (currentIndex > 0) {
                currentIndex--;
                playAudio(playlist.get(currentIndex));
            } else {
                currentIndex = playlist.size() - 1; // Go to the last track
                playAudio(playlist.get(currentIndex));
            }
        }
    }

    public void pauseAudio() {
        if (clip != null && clip.isRunning()) {
            clipTimePosition = clip.getMicrosecondPosition(); // Store the current position
            clip.stop();
        }
    }

    public void resumeAudio() {
        if (clip != null && !clip.isRunning()) {
            clip.setMicrosecondPosition(clipTimePosition); // Set the position to the stored position
            clip.start();
        }
    }

    public void stopAudio() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}
