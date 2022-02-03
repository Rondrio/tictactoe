import java.time.*;

public class TestGUI {
    public static void main(String[] args) throws InterruptedException {
        GUI gui = new GUI();

        gui.PrintImage(gui.grid,0,0,37,160,"black");
        gui.PrintImage(gui.o,0,0,10,30,"red");
        gui.PrintImage(gui.x,20,27,10,30,"blue");
        while (true){
            gui.PrintBuffer();
            Thread.sleep(1000/20);
        }
    }
}
