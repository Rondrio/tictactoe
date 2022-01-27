public class SplashState implements TicTacToeState {

    TicTacToe game;

    public SplashState(TicTacToe t) {
        game = t;
    }

    @Override
    public void PrintState() {
        // TODO Auto-generated method stub
        System.out.println("Welcome to Tic-Tac-Toe\nPress O/X for O-/X-Player starting");
    }

    @Override
    public void HandleKeypress(String k) {
        // TODO Auto-generated method stub
        switch(k.toLowerCase()) {
            case "o":
                game.SetState(game.OTurnState);
                break;
            case "x":
                game.SetState(game.XTurnState);
                break;
            default:
                game.SetState(game.XTurnState);
        }

    }
    
}
