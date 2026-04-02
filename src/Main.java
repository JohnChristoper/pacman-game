import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int rows = 21;
        int column = 19;
        int tileSize = 32;
        int boardWidth = column * tileSize;
        int boardHeight = rows * tileSize;

        JFrame frame = new JFrame("Pac Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Pacman pacmanGame = new Pacman();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);
    }
}