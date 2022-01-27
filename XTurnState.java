public class XTurnState implements TicTacToeState{
    
    TicTacToe game;

    public XTurnState(TicTacToe t) {
        game = t;
    }

    @Override
    public void PrintState() {
        // TODO Auto-generated method stub
        System.out.println("X am Zug");
    }

    @Override
    public void HandleKeypress(String k) {

        int pos = -1;
        
        try {
            pos += Integer.valueOf(k);
            if (pos <1 && pos > 9) {
                throw new RuntimeException("Zahl nicht zwischen 1-9");
            }
        } catch(Exception e) {
            System.out.println("Bitte eine Zahl zwischen 1-9");
        }

        if (!game.SetGrid(pos, "X")) {
            System.out.println("Feld bereits belegt");
            return;
        };
        
        if (game.CheckResult() || game.round == 9) {
            if (game.round != 9) {
                game.setWinner("X");
            }
            game.SetState(game.EndState);
            return;
        }

        game.SetState(game.OTurnState);
        System.out.println(game.getGrid());

    }

}
