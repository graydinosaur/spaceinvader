import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;


public class SpaceInvaders extends JPanel{
    //size of panel
    int tileSize = 32;
    int rows = 16;
    int columns =16;
    int boardWidth = tileSize * columns;
    int boardHeight = tileSize * rows;

    //variables images
    Image shipImg;
    Image alienImg;
    Image alienCyanImg;
    Image alienMagentaImg;
    Image alienYellowImg;
    //store in array
    ArrayList<Image> alienImArray;

    // constructor
    SpaceInvaders() {
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.BLACK);

        shipImg = new ImageIcon(getClass().getResource("./images/ship.png")).getImage();
        alienImg= new ImageIcon(getClass().getResource("./images/alien.png")).getImage();
        alienCyanImg = new ImageIcon(getClass().getResource("./images/alien-cyan.png")).getImage();
        alienMagentaImg = new ImageIcon(getClass().getResource("./images/alien-magenta.png")).getImage();
        alienYellowImg = new ImageIcon(getClass().getResource("./images/alien-yellow.png")).getImage();



    }
}
