package com.clyde.component;

import com.clyde.model.Model_Music;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class Music extends javax.swing.JPanel {

    public Music() {
        initComponents();
        init();
    }
    
     private void init() {
        int i = 0;
        try {
            File folder = new File(getClass().getResource("/com/clyde/resources/").toURI());
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        i++;
                        String fileName = file.getName();
                        String[] parts = fileName.split("\\.");
                        if (parts.length == 2) {
                            
                            String duration = "";                            
                            try {
                                File audioFile = new File(file.getPath());
                                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);

                                AudioFileFormat format = AudioSystem.getAudioFileFormat(audioFile);
                                long audioFileLength = audioFile.length();
                                int frameSize = format.getFormat().getFrameSize();
                                float frameRate = format.getFormat().getFrameRate();

                                long durationInMillis = (long) (((double) audioFileLength / (frameSize * frameRate)) * 1000.0);

                                long durationInSeconds = durationInMillis / 1000;
                                long hours = durationInSeconds / 3600;
                                long minutes = (durationInSeconds % 3600) / 60;
                                long seconds = durationInSeconds % 60;

                                // Format minutes and seconds with leading zeros if necessary
                                String formattedMinutes = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);
                                String formattedSeconds = (seconds < 10) ? "0" + seconds : String.valueOf(seconds);

                                // Combine minutes and seconds with a colon
                                duration = formattedMinutes + ":" + formattedSeconds;
                            } catch (IOException | javax.sound.sampled.UnsupportedAudioFileException e) {
                                e.printStackTrace();
                            }
                            
                            String songName = parts[0];
                            String extension = parts[1];
                            list.addItem(new Model_Music(String.valueOf(i), songName, duration));
                        }
                    }
                }
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        list = new com.clyde.component.ListMusic<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Your Music");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.clyde.component.ListMusic<String> list;
    // End of variables declaration//GEN-END:variables
}
