import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private Image bgImage;

    public ImagePanel() {
        
bgImage = new ImageIcon(getClass().getResource("/penjualanmobil/img/capybara.jpg")).getImage();    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (bgImage != null) {
            g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}