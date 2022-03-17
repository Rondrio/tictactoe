package GUI;

import java.io.File;
import java.awt.Color;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.lang.Math;

public class GUI {

    public BufferedImage grid;
    public BufferedImage x;
    public BufferedImage o;

    private int height = 37;
    private int width = 160;

    public static final String BLACK = "\u001B[40m";
    public static final String RED = "\u001B[41m";
    public static final String BLUE = "\u001B[44m";
    public static final String WHITE = "\u001B[47m";
    public static final String RESET = "\u001B[0m";

    private String[][] screenBuffer = new String[height][width];

    public GUI() {
        for (int y = 0; y < screenBuffer.length; y++) {
            for (int x = 0; x < screenBuffer[y].length; x++) {
                screenBuffer[y][x] = WHITE + " " + RESET;
            }
        }

        try {
            grid = ImageIO.read(new File("textures/grid.png"));
            o = ImageIO.read(new File("textures/o.png"));
            x = ImageIO.read(new File("textures/x.png"));

        } catch (Exception e) {
            System.out.println("unable to load textures");
            System.exit(3);
        }
    }

    public void PrintImage(BufferedImage image,int yPos, int xPos,int wantedHeight,int wantedWidth, String color) {
        int xCounter = xPos;
        int yCounter = yPos;

        for (int y = 0; y < image.getHeight() && yCounter < height; y += Math.ceil(image.getHeight() / wantedHeight)) {
            for (int x = 0; x < image.getWidth() && xCounter < width; x += Math.ceil(image.getWidth() / wantedWidth)) {
                Color c = new Color(image.getRGB(x, y), true);

                if (c.getAlpha() < 200) {
                    xCounter++;
                    continue;
                }

                switch (color.toLowerCase()) {
                    case "black":
                        screenBuffer[yCounter][xCounter] = BLACK + " " + RESET;
                        break;
                    case "white":
                        screenBuffer[yCounter][xCounter] = WHITE + " " + RESET;
                        break;
                    case "blue":
                        screenBuffer[yCounter][xCounter] = BLUE + " " + RESET;
                        break;
                    case "red":
                        screenBuffer[yCounter][xCounter] = RED + " " + RESET;
                        break;
                }
                xCounter++;
            }
            yCounter++;
            xCounter = xPos;
        }
    }


    public void PrintBuffer() {
        System.out.printf("\u001B[H");
        String output = "";
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                output += screenBuffer[y][x];
            }
            output += "\n";
        }
        System.out.print(output);
    }

}
