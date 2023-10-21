package Swing;

import java.awt.Graphics;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class CustomTabbedPaneUI extends BasicTabbedPaneUI {

    @Override
    protected void installDefaults() {
        super.installDefaults();
        tabAreaInsets.top = 0;
        tabAreaInsets.bottom = 0;
        tabAreaInsets.left = 0;
        tabAreaInsets.right = 0;
    }

//    @Override
//    protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
//    }

    @Override
    protected int calculateMaxTabHeight(int tabPlacement) {
        return -5;
    }
}
