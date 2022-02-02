import java.io.Console;

public class TestTicTacToe {
    
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();


        game.SetState(game.getSplashState());

        Console c = System.console();

        while (true) {
            String s = c.readLine();
            game.state.HandleKeypress(s);
            game.PrintGrid();
        }

    }
}
