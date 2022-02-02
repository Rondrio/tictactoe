public class OTurnState implements TicTacToeState{
    
    TicTacToe game;

    public OTurnState(TicTacToe t) {
        game = t;
    }

    @Override
    public void PrintState() {
        // TODO Auto-generated method stub
        System.out.println("O am Zug");
    }

    @Override
    public void HandleKeypress(String k) {
        // TODO Auto-generated method stub
        int pos = -1;
        
        try {
            pos += Integer.valueOf(k);
            if (pos <1 && pos > 9) {
                throw new RuntimeException("Zahl nicht zwischen 1-9");
            }
        } catch(Exception e) {
            System.out.println("Bitte eine Zahl zwischen 1-9");
        }

        if (!game.SetGrid(pos, "O")) {
            System.out.println("Feld bereits belegt");
            return;
        };
        if (game.CheckResult() || game.round == 9) {
            if (game.round != 9) {
                game.setWinner("O");
            }

            game.SetState(game.EndState);
            return;
        }
        game.SetState(game.XTurnState);
    }
}
