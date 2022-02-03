import java.time.*;

public class TestGUI {
    public static void main(String[] args) throws InterruptedException {
        GUI gui = new GUI();

        System.out.println(gui.BLUE + "hello there" + gui.RESET);

    //    gui.PrintImage(gui.grid, 0, 0, "white");
        gui.PrintImage(gui.grid,0,0,37,160,"red");
        while (true){
            gui.PrintBuffer();
            System.out.printf("\u001B[H");
            Thread.sleep(1000/20);
        }
    }
}
