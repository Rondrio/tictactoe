import GUI.GUI;
import AI.AI;

public class TicTacToe {

    GUI gui = new GUI();

    AI ai;

    TicTacToeState SplashState;
    TicTacToeState XTurnState;
    TicTacToeState OTurnState;
    TicTacToeState EndState;

    TicTacToeState state;

    private String[] grid = { "#", "#", "#", "#", "#", "#", "#", "#", "#" };

    private String winner;

    int round;

    TicTacToe() {
        gui.PrintImage(gui.grid, 0, 0, 37, 160, "black");
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

        int sizeHeight = 10;
        int sizeWidth = 10;

        int column1 = 22;
        int column2 = 80;
        int column3 = 130;

        int row1 = 1;
        int row2 = 15;
        int row3 = 27;

        grid[pos] = player;
        switch (pos) {
            case 0:
                if (player == "O") {
                    gui.PrintImage(gui.o, row1, column1, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row1, column1, sizeHeight, sizeWidth, "red");
                }
                break;
            case 1:
                if (player == "O") {
                    gui.PrintImage(gui.o, row1, column2, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row1, column2, sizeHeight, sizeWidth, "red");
                }
                break;
            case 2:
                if (player == "O") {
                    gui.PrintImage(gui.o, row1, column3, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row1, column3, sizeHeight, sizeWidth, "red");
                }
                break;

            case 3:
                if (player == "O") {
                    gui.PrintImage(gui.o, row2, column1, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row2, column1, sizeHeight, sizeWidth, "red");
                }
                break;
            case 4:
                if (player == "O") {
                    gui.PrintImage(gui.o, row2, column2, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row2, column2, sizeHeight, sizeWidth, "red");
                }
                break;
            case 5:
                if (player == "O") {
                    gui.PrintImage(gui.o, row2, column3, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row2, column3, sizeHeight, sizeWidth, "red");
                }
                break;

            case 6:
                if (player == "O") {
                    gui.PrintImage(gui.o, row3, column1, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row3, column1, sizeHeight, sizeWidth, "red");
                }
                break;
            case 7:
                if (player == "O") {
                    gui.PrintImage(gui.o, row3, column2, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row3, column2, sizeHeight, sizeWidth, "red");
                }
                break;
            case 8:
                if (player == "O") {
                    gui.PrintImage(gui.o, row3, column3, sizeHeight, sizeWidth, "blue");
                } else {
                    gui.PrintImage(gui.x, row3, column3, sizeHeight, sizeWidth, "red");
                }
                break;
        }

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
        gui.PrintBuffer();
    }

}
