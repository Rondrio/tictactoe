import java.io.Console;

import javax.lang.model.type.NullType;

public class TestTicTacToe {
    
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();


        game.SetState(game.getSplashState());

        Console c = System.console();

        while (true) {
            if (game.ai != null && game.state == game.OTurnState) {
                int i = game.ai.playTurn();
                game.state.HandleKeypress(Integer.toString(i));
                game.PrintGrid();
                continue;
            }

            String s = c.readLine();
            game.state.HandleKeypress(s);
            game.PrintGrid();
        }

    }
}
