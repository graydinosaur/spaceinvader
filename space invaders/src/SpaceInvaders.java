import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class SpaceInvaders extends JPanel implements ActionListener {
    class Block {
        int x; // Corrected from 'a'
        int y;
        int width;
        int height;
        Image img;
        boolean alive = true; // Added semicolon
        boolean used = false; // Added semicolon

        // Constructor
        Block(int x, int y, int width, int height, Image img) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.img = img;
        }
    }

    // Size of board
    int tileSize = 32;
    int rows = 16;
    int columns = 16;
    int boardWidth = tileSize * columns;
    int boardHeight = tileSize * rows;

    // Variables for images
    Image shipImg;
    Image alienImg;
    Image alienCyanImg;
    Image alienMagentaImg;
    Image alienYellowImg;

    // Store in array
    ArrayList<Image> alienImgArray; // Corrected from 'allieiimgarray'

    // Ship
    int shipWidth = tileSize * 2;
    int shipHeight = tileSize;
    int shipX = tileSize * columns / 2 - tileSize;
    int shipY = boardHeight - tileSize * 2;

    Block ship; // Declare the ship as a Block object
    Timer gameloop;
    // Constructor
    SpaceInvaders() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        // Load images
        shipImg = new ImageIcon(getClass().getResource("./images/ship.png")).getImage();
        alienImg = new ImageIcon(getClass().getResource("./images/alien.png")).getImage();
        alienCyanImg = new ImageIcon(getClass().getResource("./images/alien-cyan.png")).getImage();
        alienMagentaImg = new ImageIcon(getClass().getResource("./images/alien-magenta.png")).getImage();
        alienYellowImg = new ImageIcon(getClass().getResource("./images/alien-yellow.png")).getImage();

        // Initialize the alien image array
        alienImgArray = new ArrayList<>();
        alienImgArray.add(alienImg);
        alienImgArray.add(alienCyanImg);
        alienImgArray.add(alienMagentaImg);
        alienImgArray.add(alienYellowImg);

        // Initialize the ship as a Block object
        ship = new Block(shipX, shipY, shipWidth, shipHeight, shipImg);
        gameloop = new Timer(1000/60, this);
        gameloop.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Draw the ship
        g.drawImage(ship.img, ship.x, ship.y, ship.width, ship.height, null); // Fixed 'ship.shipimg' to 'ship.img'
    }
    @Override
    public void actionPerformed(ActionEvent e){
        repaint();
    }
}
