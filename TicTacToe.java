public class TicTacToe {

    TicTacToeState SplashState;
    TicTacToeState XTurnState;
    TicTacToeState OTurnState;
    TicTacToeState EndState;

    TicTacToeState state;

    private String[] grid = { "#", "#", "#", "#", "#", "#", "#", "#", "#" };

    private String winner;

    int round;

    TicTacToe() {
        SplashState = new SplashState(this);
        XTurnState = new XTurnState(this);
        OTurnState = new OTurnState(this);
        EndState = new EndState(this);
    }

    public TicTacToeState getSplashState() {
        return SplashState;
    }

    public TicTacToeState getXTurnState() {
        return XTurnState;
    }

    public TicTacToeState getOTurnState() {
        return OTurnState;
    }

    public TicTacToeState getEndState() {
        return EndState;
    }

    void SetState(TicTacToeState newState) {
        state = newState;
        state.PrintState();
    }

    public boolean SetGrid(int pos, String player) {

        if (!grid[pos].equals("#")) {
            return false;
        }

        grid[pos] = player;
        return true;
    }

    public Boolean CheckResult() {

        if (grid[0].equals(grid[1]) && grid[1].equals(grid[2]) && !grid[0].equals("#")) {
            return true;
        } else if (grid[3].equals(grid[4]) && grid[4].equals(grid[5]) && !grid[3].equals("#")) {
            return true;

        } else if (grid[6].equals(grid[7]) && grid[7].equals(grid[8]) && !grid[6].equals("#")) {
            return true;

        } else if (grid[0].equals(grid[3]) && grid[3].equals(grid[6]) && !grid[0].equals("#")) {
            return true;

        } else if (grid[1].equals(grid[4]) && grid[4].equals(grid[7]) && !grid[1].equals("#")) {
            return true;

        } else if (grid[2].equals(grid[5]) && grid[5].equals(grid[8]) && !grid[2].equals("#")) {
            return true;

        } else if (grid[0].equals(grid[4]) && grid[4].equals(grid[8]) && !grid[0].equals("#")) {
            return true;

        } else if (grid[2].equals(grid[4]) && grid[4].equals(grid[6]) && !grid[2].equals("#")) {
            return true;

        }
        return false;
    }

    public String[] getGrid() {
        return grid;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }

    public void PrintGrid() {
        for (int i = 0; i < 9; i += 3) {
            System.out.printf("%s %s %s\n", grid[i], grid[i + 1], grid[i + 2]);
        }
    }

}
