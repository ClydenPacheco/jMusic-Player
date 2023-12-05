package com.clyde.component;

import com.clyde.model.Model_Music;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class ListMusic <E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int playIndex = -1;
    private Clip clip;
    private final AudioController audioController;

    public ListMusic() {
        audioController = new AudioController();
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int clickedIndex = locationToIndex(me.getPoint());
                    if (clickedIndex != -1) {
                        Object clickedItem = getModel().getElementAt(clickedIndex);
                        if (clickedItem instanceof Model_Music) {
                            Model_Music clickedMusic = (Model_Music) clickedItem;
                            String clickedText = clickedMusic.getName(); // Extract text
                            String path = "C:\\Users\\clyde\\OneDrive\\Documents\\NetBeansProjects\\MusicPlayer\\src\\com\\clyde\\resources\\"+clickedText+".wav";
                            audioController.playAudio(path);
                        }
                    }
                    playIndex = clickedIndex; // Update playIndex as before (if needed)
                    repaint();
                }
            }
        });
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_Music data;
                if (o instanceof Model_Music) {
                    data = (Model_Music) o;
                } else {
                    data = new Model_Music("1", "No Music", "00:00");
                }
                ItemMusic item = new ItemMusic(data);
                item.setPlay(index == playIndex);
                return item;
            }
        };
    }

    public void addItem(Model_Music data) {
        model.addElement(data);
    }
}
