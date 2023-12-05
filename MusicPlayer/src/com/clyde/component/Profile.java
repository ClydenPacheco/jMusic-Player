package com.clyde.component;

import com.clyde.model.Model_Profile;
import javax.swing.ImageIcon;

public class Profile extends javax.swing.JPanel {

    public Profile() {
        initComponents();
        init();
    }
    
    private void init() {
        list.addItem(new Model_Profile("Martin Garrix", "Martijn Gerard Garritsen, known professionally as Martin Garrix and also as Ytram and GRX, is a Dutch DJ and record producer who was ranked number one on DJ Mag's Top 100 DJs list for three consecutive years—2016, 2017, and 2018.", new ImageIcon(getClass().getResource("/com/clyde/icon/test/mgpro.jpeg"))));
        list.addItem(new Model_Profile("Alesso", "Alessandro Renato Rodolfo Lindblad, better known by his stage name Alesso, is a Swedish DJ and music producer.", new ImageIcon(getClass().getResource("/com/clyde/icon/test/alesso.png"))));
        list.addItem(new Model_Profile("Avicii", "Tim Bergling known professionally as Avicii was a Swedish DJ, remixer, and music producer.", new ImageIcon(getClass().getResource("/com/clyde/icon/test/avicii_pro.jpg"))));
        list.addItem(new Model_Profile("Kygo", "Kyrre Gørvell-Dahll, known professionally as Kygo, is a Norwegian DJ and music producer.", new ImageIcon(getClass().getResource("/com/clyde/icon/test/kygo_pro.jpg"))));
        list.addItem(new Model_Profile("Sigala", "Bruce Fielder, known professionally as Sigala, is an English DJ and record producer.", new ImageIcon(getClass().getResource("/com/clyde/icon/test/sigala_pro.jpg"))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        list = new com.clyde.component.ListProfile<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Artists");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.clyde.component.ListProfile<String> list;
    // End of variables declaration//GEN-END:variables
}
