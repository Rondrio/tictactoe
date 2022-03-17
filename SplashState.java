import AI.AI;

public class SplashState implements TicTacToeState {

    TicTacToe game;

    public SplashState(TicTacToe t) {
        game = t;
    }

    @Override
    public void PrintState() {
        System.out.println("Welcome to Tic-Tac-Toe\nPress O/X for O-/X-Player starting\nPress a to play against ai");
    }

    @Override
    public void HandleKeypress(String k) {
        switch(k.toLowerCase()) {
            case "o":
                game.SetState(game.OTurnState);
                break;
            case "x":
                game.SetState(game.XTurnState);
                break;
            case "a":
                game.ai = new AI();
                game.SetState(game.XTurnState);
            default:
                game.SetState(game.XTurnState);
        }

    }
    
}
