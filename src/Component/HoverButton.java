package Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class HoverButton extends javax.swing.JPanel {

    private int corner_radius = 30;
    private int border = 0;
    private Color baseColor;
    private Color hoverColor = Color.WHITE;

    public HoverButton() {
        initComponents();
        setOpaque(false);
        baseColor = getBackground();
    }

    public void setBaseColor(Color baseColor) {
        this.baseColor = baseColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

    public void setRadius(int rad) {
        corner_radius = rad;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public void setHover(boolean hover) {
        if (hover) {
            setBackground(hoverColor);
        } else {
            setBackground(baseColor);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (border > 0) {
            g2.setColor(new Color(255, 155, 155));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), corner_radius, corner_radius);
        }
        g2.setColor(getBackground());
        g2.fillRoundRect(border, border, getWidth() - border * 2, getHeight() - border * 2, corner_radius - border * 2, corner_radius - border * 2);
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
