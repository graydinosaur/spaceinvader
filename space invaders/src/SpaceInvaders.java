import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.*;


public class SpaceInvaders extends JPanel{
    class Block {
        int a;
        int y;
        int width;
        int height;
        Image img;
        boolean alive = true // used for aliens
        boolean used = false // used for bullets
        
        //constructor
        Block(int x, int y, int width, int height, Iamge img) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.img = img;
        }
    }
    //size of board
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

    //ship
    int shipWidth = tileSize*2;
    int shipHeight = tileSize;
    int shipX = tileSize*columns/2 - tileSize;
    int shipY = boardWeight - tileSize*2;


    // constructor
    SpaceInvaders() {
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.BLACK);

        // load images
        shipImg = new ImageIcon(getClass().getResource("./images/ship.png")).getImage();
        alienImg= new ImageIcon(getClass().getResource("./images/alien.png")).getImage();
        alienCyanImg = new ImageIcon(getClass().getResource("./images/alien-cyan.png")).getImage();
        alienMagentaImg = new ImageIcon(getClass().getResource("./images/alien-magenta.png")).getImage();
        alienYellowImg = new ImageIcon(getClass().getResource("./images/alien-yellow.png")).getImage();

        alienImgArray = new ArrayList<Image>();
        alienImgArray.add(alienImg);
        alienImgArray.add(alienCyanImg);
        alienImgArray.add(alienMagentaImg);
        alienImgArray.add(alienYellowImg);

    }
}
