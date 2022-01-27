

public class EndState implements TicTacToeState{
    
    TicTacToe game;

    public EndState(TicTacToe t) {
        game = t;
    }

    @Override
    public void PrintState() {
        // TODO Auto-generated method stub
        if (game.getWinner() != "") {
            System.out.printf("%s hat gewonnen\n",game.getWinner());
            return;
        } 
        System.out.printf("Unentschieden\n");
    }

    @Override
    public void HandleKeypress(String k) {
        // TODO Auto-generated method stub
        switch (k) {
            case "r":
            game.SetState(game.SplashState);
            break;

            default:
                System.exit(0);
        }
        
    }
}
