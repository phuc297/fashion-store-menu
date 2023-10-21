package Swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {

    private final ModelMenuItem model;
    private boolean selected = false;
    private boolean over;

    public MenuItem(ModelMenuItem model) {
        initComponents();
        setOpaque(false);
        this.model = model;
        txtTab.setText(model.getText());
        icon.setImage(model.toIcon());
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTab = new javax.swing.JLabel();
        icon = new Component.ImagePanel();

        setPreferredSize(new java.awt.Dimension(200, 50));

        txtTab.setBackground(new java.awt.Color(51, 204, 255));
        txtTab.setFont(new java.awt.Font("Cabin", 0, 14)); // NOI18N
        txtTab.setForeground(new java.awt.Color(255, 255, 255));
        txtTab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTab.setText("áđâsd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtTab, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected || over) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                g2.setColor(new Color(255, 255, 255));
                txtTab.setForeground(model.getColorOver());
            } else {
                g2.setColor(new Color(255, 255, 255));
            }
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 0, 0);
            icon.setImage(model.toIconOver());
            txtTab.setForeground(model.getColorOver());
        }
        super.paintComponent(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.ImagePanel icon;
    private javax.swing.JLabel txtTab;
    // End of variables declaration//GEN-END:variables
}
