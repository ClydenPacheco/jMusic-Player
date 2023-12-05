package com.clyde.form;

import com.clyde.model.Model_Popular;
import javax.swing.ImageIcon;

public class Form_Artists extends javax.swing.JPanel {

    public Form_Artists() {
        initComponents();
        init();
    }

    private void init() {
        mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/clyde/icon/test/martingarrix.jpg")), "Martin Garrix", "15 Albums | 17.5M Follower"));
        mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/clyde/icon/test/avicii.png")), "Avicii True Stories", "15 Albums | 17.5M Follower"));
        mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/clyde/icon/test/kygo.png")), "Kygo and Alan Walker", "15 Albums | 17.5M Mollowers"));
        mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/clyde/icon/test/davidguetta.jpg")), "David Guetta", "15 Albums | 17.5M Mollowers"));
        mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/clyde/icon/test/galantis.jpg")), "Galantis", "15 Albums | 17.5M Mollowers"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mostPopular = new com.clyde.component.MostPopular();
        music2 = new com.clyde.component.Music();
        profile2 = new com.clyde.component.Profile();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(171, 38, 178));
        jLabel1.setText("Artists");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 68, 68));
        jLabel2.setText("Most Popular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(mostPopular, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(music2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostPopular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(music2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.clyde.component.MostPopular mostPopular;
    private com.clyde.component.Music music2;
    private com.clyde.component.Profile profile2;
    // End of variables declaration//GEN-END:variables
}
