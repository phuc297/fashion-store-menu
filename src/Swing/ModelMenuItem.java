package Swing;

import java.awt.Color;

public class ModelMenuItem {

    private String icon;
    private String iconOver;
    private String text;

    private final Color color = Color.white;
    private final Color colorOver = new Color(255, 155, 155);

    public ModelMenuItem(String icon, String iconOver, String text) {
        this.icon = icon;
        this.iconOver = iconOver;
        this.text = text;
    }

    public String toIcon() {
        return icon + ".png";
    }

    public String toIconOver() {
        return iconOver + ".png";
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconOver() {
        return iconOver;
    }

    public void setIconOver(String iconOver) {
        this.iconOver = iconOver;
    }

    public Color getColor() {
        return color;
    }

    public Color getColorOver() {
        return colorOver;
    }

}
