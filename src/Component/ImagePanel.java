package Component;

import static Utils.Cons.ASSETS_PATH;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ImagePanel extends JComponent {

    public Icon image;

    public ImagePanel() {
        super();
        setPreferredSize(new Dimension(50, 50));
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(String imagePath) {
        Icon imageIcon = new ImageIcon(ASSETS_PATH + imagePath);
        this.image = imageIcon;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            Graphics2D g2 = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Icon icon = new ImageIcon(toImage(image));

            double scale = Math.min((double) width / icon.getIconWidth(), (double) height / icon.getIconHeight());

            int newWidth = (int) (icon.getIconWidth() * scale);
            int newHeight = (int) (icon.getIconHeight() * scale);
            int x = (width - newWidth) / 2;
            int y = (height - newHeight) / 2;

            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(toImage(icon), 0, 0, width, height, this);

        }
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }
}
