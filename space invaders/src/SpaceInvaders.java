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

    // constructor
    SpaceInvaders() {
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.BLACK);
    }
}
