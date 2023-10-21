package GUI;

import Swing.CustomTabbedPaneUI;
import Swing.MenuClickListener;
import java.awt.BorderLayout;

public class demomenu extends javax.swing.JFrame {

    public demomenu() {
        initComponents();

        setLayoutPanel();

        pnMenu.addMenuClickListener(new MenuClickListener() {
            @Override
            public void onMenuClick(int index) {
                if (index == 0) {
                    pnTab.setSelectedIndex(0);
                }
                if (index == 1) {
                    pnTab.setSelectedIndex(1);
                }
                if (index == 2) {
                    pnTab.setSelectedIndex(2);
                }
                if (index == 3) {
                    pnTab.setSelectedIndex(3);
                }
                if (index == 4) {
                    pnTab.setSelectedIndex(4);
                }
                if (index == 5) {
                    pnTab.setSelectedIndex(5);
                }
                if (index == 6) {
                    pnTab.setSelectedIndex(6);
                }
                if (index == 7) {
                    pnTab.setSelectedIndex(7);
                }
                if (index == 8) {
                    pnTab.setSelectedIndex(8);
                }
            }
        });
    }

    private void setLayoutPanel() {
        pnTab.setUI(new CustomTabbedPaneUI());
        pnContain.setLayout(new BorderLayout());
        pnContain.add(pnMenu, BorderLayout.WEST);
        pnContain.add(pnContainTab, BorderLayout.CENTER);
        
        pnContainTab.setLayout(new BorderLayout());
        pnContainTab.add(pnTab, BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnContain = new javax.swing.JPanel();
        pnMenu = new GUI.Menu();
        pnContainTab = new javax.swing.JPanel();
        pnTab = new javax.swing.JTabbedPane();
        pnSale = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnProduct = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnCategory = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnProvider = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnImport = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnDiscount = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnEmployee = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnCustomer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnStats = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setResizable(false);

        pnContain.setBackground(new java.awt.Color(248, 249, 251));

        pnTab.setBackground(new java.awt.Color(250, 250, 250));

        pnSale.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel3.setText("Bán hàng");

        javax.swing.GroupLayout pnSaleLayout = new javax.swing.GroupLayout(pnSale);
        pnSale.setLayout(pnSaleLayout);
        pnSaleLayout.setHorizontalGroup(
            pnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaleLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnSaleLayout.setVerticalGroup(
            pnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("Bán hàng", pnSale);

        pnProduct.setBackground(new java.awt.Color(250, 250, 250));

        jLabel2.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel2.setText("Sản phẩm");

        javax.swing.GroupLayout pnProductLayout = new javax.swing.GroupLayout(pnProduct);
        pnProduct.setLayout(pnProductLayout);
        pnProductLayout.setHorizontalGroup(
            pnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnProductLayout.setVerticalGroup(
            pnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("sản phẩm", pnProduct);

        pnCategory.setBackground(new java.awt.Color(250, 250, 250));

        jLabel4.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel4.setText("Danh mục");

        javax.swing.GroupLayout pnCategoryLayout = new javax.swing.GroupLayout(pnCategory);
        pnCategory.setLayout(pnCategoryLayout);
        pnCategoryLayout.setHorizontalGroup(
            pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoryLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnCategoryLayout.setVerticalGroup(
            pnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("danh mục", pnCategory);

        pnProvider.setBackground(new java.awt.Color(250, 250, 250));

        jLabel5.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel5.setText("Nhà cung cấp");

        javax.swing.GroupLayout pnProviderLayout = new javax.swing.GroupLayout(pnProvider);
        pnProvider.setLayout(pnProviderLayout);
        pnProviderLayout.setHorizontalGroup(
            pnProviderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProviderLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnProviderLayout.setVerticalGroup(
            pnProviderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProviderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("NCC", pnProvider);

        pnImport.setBackground(new java.awt.Color(250, 250, 250));

        jLabel6.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel6.setText("Nhập hàng");

        javax.swing.GroupLayout pnImportLayout = new javax.swing.GroupLayout(pnImport);
        pnImport.setLayout(pnImportLayout);
        pnImportLayout.setHorizontalGroup(
            pnImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImportLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnImportLayout.setVerticalGroup(
            pnImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("Nhập hàng", pnImport);

        pnDiscount.setBackground(new java.awt.Color(250, 250, 250));

        jLabel7.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel7.setText("Khuyến mãi");

        javax.swing.GroupLayout pnDiscountLayout = new javax.swing.GroupLayout(pnDiscount);
        pnDiscount.setLayout(pnDiscountLayout);
        pnDiscountLayout.setHorizontalGroup(
            pnDiscountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDiscountLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnDiscountLayout.setVerticalGroup(
            pnDiscountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDiscountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("Khuyến mãi", pnDiscount);

        pnEmployee.setBackground(new java.awt.Color(250, 250, 250));

        jLabel8.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel8.setText("Nhân viên");

        javax.swing.GroupLayout pnEmployeeLayout = new javax.swing.GroupLayout(pnEmployee);
        pnEmployee.setLayout(pnEmployeeLayout);
        pnEmployeeLayout.setHorizontalGroup(
            pnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnEmployeeLayout.setVerticalGroup(
            pnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("Nviên", pnEmployee);

        pnCustomer.setBackground(new java.awt.Color(250, 250, 250));

        jLabel9.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel9.setText("Khách hàng");

        javax.swing.GroupLayout pnCustomerLayout = new javax.swing.GroupLayout(pnCustomer);
        pnCustomer.setLayout(pnCustomerLayout);
        pnCustomerLayout.setHorizontalGroup(
            pnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCustomerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnCustomerLayout.setVerticalGroup(
            pnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("Khách hàng", pnCustomer);

        pnStats.setBackground(new java.awt.Color(250, 250, 250));

        jLabel10.setFont(new java.awt.Font("Cabin", 1, 24)); // NOI18N
        jLabel10.setText("Thống kê");

        javax.swing.GroupLayout pnStatsLayout = new javax.swing.GroupLayout(pnStats);
        pnStats.setLayout(pnStatsLayout);
        pnStatsLayout.setHorizontalGroup(
            pnStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatsLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        pnStatsLayout.setVerticalGroup(
            pnStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        pnTab.addTab("Thống kê", pnStats);

        javax.swing.GroupLayout pnContainTabLayout = new javax.swing.GroupLayout(pnContainTab);
        pnContainTab.setLayout(pnContainTabLayout);
        pnContainTabLayout.setHorizontalGroup(
            pnContainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContainTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        pnContainTabLayout.setVerticalGroup(
            pnContainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContainTabLayout.createSequentialGroup()
                .addComponent(pnTab, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnContainLayout = new javax.swing.GroupLayout(pnContain);
        pnContain.setLayout(pnContainLayout);
        pnContainLayout.setHorizontalGroup(
            pnContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(pnContainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContainLayout.setVerticalGroup(
            pnContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContainLayout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(pnContainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnContainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new demomenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnCategory;
    private javax.swing.JPanel pnContain;
    private javax.swing.JPanel pnContainTab;
    private javax.swing.JPanel pnCustomer;
    private javax.swing.JPanel pnDiscount;
    private javax.swing.JPanel pnEmployee;
    private javax.swing.JPanel pnImport;
    private GUI.Menu pnMenu;
    private javax.swing.JPanel pnProduct;
    private javax.swing.JPanel pnProvider;
    private javax.swing.JPanel pnSale;
    private javax.swing.JPanel pnStats;
    private javax.swing.JTabbedPane pnTab;
    // End of variables declaration//GEN-END:variables
}
