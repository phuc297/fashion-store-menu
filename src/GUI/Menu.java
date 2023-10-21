package GUI;

import Swing.ModelMenuItem;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import Swing.MenuClickListener;
import java.awt.Color;

public class Menu extends javax.swing.JPanel {

    public void addMenuClickListener(MenuClickListener event) {
        listMenu1.addMenuClickListener(event);
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        listMenu1.addItem(new ModelMenuItem("cart", "cart1", "Bán hàng"));
        listMenu1.addItem(new ModelMenuItem("clothe", "clothe1", "Sản phẩm"));
        listMenu1.addItem(new ModelMenuItem("document", "document1", "Danh mục"));
        listMenu1.addItem(new ModelMenuItem("provider", "provider1", "Nhà cung cấp"));
        listMenu1.addItem(new ModelMenuItem("import", "import1", "Nhập hàng"));
        listMenu1.addItem(new ModelMenuItem("discount", "discount1", "Khuyến mãi"));
        listMenu1.addItem(new ModelMenuItem("employee", "employee1", "Nhân viên"));
        listMenu1.addItem(new ModelMenuItem("customer", "customer1", "Khách hàng"));
        listMenu1.addItem(new ModelMenuItem("stats", "stats1", "Thống kê"));

        logo.setImage("logo.png");
        imagePanel2.setImage("shopping.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAccount = new javax.swing.JPanel();
        logo = new Component.ImagePanel();
        listMenu1 = new Swing.ListMenu<>();
        imagePanel2 = new Component.ImagePanel();

        setAutoscrolls(true);
        setOpaque(false);

        panelAccount.setOpaque(false);

        javax.swing.GroupLayout panelAccountLayout = new javax.swing.GroupLayout(panelAccount);
        panelAccount.setLayout(panelAccountLayout);
        panelAccountLayout.setHorizontalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAccountLayout.setVerticalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        listMenu1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255, 155, 155));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.ImagePanel imagePanel2;
    private Swing.ListMenu<String> listMenu1;
    private Component.ImagePanel logo;
    private javax.swing.JPanel panelAccount;
    // End of variables declaration//GEN-END:variables

    void addMenuClickListener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
