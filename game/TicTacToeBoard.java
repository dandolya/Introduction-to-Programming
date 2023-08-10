package game;

import java.util.Arrays;
import java.util.Map;

public class TicTacToeBoard implements Board, Position {
    private static final Map<Cell, String> CELL_TO_STRING = Map.of(
            Cell.E, ".",
            Cell.X, "X",
            Cell.O, "0"
    );

    private final Cell[][] field;
    private Cell turn;
    private int m, n, k;

    public TicTacToeBoard(int m, int n, int k, int i) {
        this.m = m;
        this.n = n;
        this.k = k;
        field = new Cell[m][n];
        for (Cell[] row : field) {
            Arrays.fill(row, Cell.E);
        }
        if (i % 2 == 0) {
            turn = Cell.X;
        } else {
            turn = Cell.O;
        }
    }

    @Override
    public Cell getTurn() {
        return turn;
    }

    @Override
    public Position getPosition() {
        return this;
    }

    @Override
    public GameResult makeMove(Move move) {
        if (!isValid(move)) {
            return GameResult.LOOSE;
        }

        field[move.getRow()][move.getCol()] = move.getValue();
        if (checkWin()) {
            return GameResult.WIN;
        }

        if (checkDraw()) {
            return GameResult.DRAW;
        }

        turn = turn == Cell.X ? Cell.O : Cell.X;
        return GameResult.UNKNOWN;
    }

    private boolean checkDraw() {
        int count = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (field[r][c] == Cell.E) {
                    count++;
                }
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

    private int check(int a, int b, int c, int d, int count) {
        if (field[a][b] == turn && field[c][d] == turn) {
            count++;
        } else if (field[a][b] == turn) {
            count = 1;
        } else {
            count = 0;
        }
        return count;
    }
    private boolean checkWin() {
        for (int r = 0; r < m; r++) {
            int count1 = 0;
            if (field[r][0] == turn) count1++;
            for (int c = 1; c < n; c++) {
                count1 = check(r, c, r, c - 1, count1);
                if (count1 == k) return true;
            }
            int count2 = 0;
            int c = 1;
            int d = r - 1;
            if (field[r][0] == turn) count2++;
            if (count2 == k) return true;
            while (c < n && d >= 0) {
                count2 = check(d, c, d + 1, c - 1, count2);
                if (count2 == k) return true;
                d--;
                c++;
            }
        }
        for (int c = 0; c < n; c++) {
            int count1 = 0;
            if(field[0][c] == turn) count1++;
            for (int r = 1; r < m; r++) {
                count1 = check(r, c, r - 1, c, count1);
                if (count1 == k) return true;
            }
            int count2 = 0;
            int d = c + 1;
            int r = 1;
            if (field[0][c] == turn) count2++;
            if (count2 == k) return true;
            while (d < n && r < m) {
                count2 = check(r, d, r - 1, d - 1, count2);
                if (count2 == k) return true;
                d++;
                r++;
            }
            int count3 = 0;
            r = m - 2;
            d = c + 1;
            if (field[m - 1][c] == turn) count3++;
            if (count3 == k) return true;
            while (d < n && r >= 0) {
                count3 = check(r, d, r + 1, d - 1, count3);
                if (count3 == k) return true;
                r--;
                d++;
            }
        }
        for (int c = m - 1; c > 0; c--) {
            int d = c + 1;
            int r = 1;
            int count = 0;
            if (field[c][0] == turn) count++;
            if (count == k) return true;
            while (d < m && r < n){
                count = check(d, r, d - 1, r - 1, count);
                if (count == k) return true;
                d++;
                r++;
            }
        }
        return false;
    }

    public boolean isValid(final Move move) {
        return 0 <= move.getRow() && move.getRow() < m
                && 0 <= move.getCol() && move.getCol() < n
                && field[move.getRow()][move.getCol()] == Cell.E
                && turn == move.getValue();
    }

    @Override
    public Cell getCell(int row, int column) {
        return field[row][column];
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        for (int r = 1; r <= n; r++) sb.append(r);
        sb.append(System.lineSeparator());
        for (int r = 0; r < m; r++) {
            sb.append(r + 1);
            for (Cell cell : field[r]) {
                sb.append(CELL_TO_STRING.get(cell));
            }
            sb.append(System.lineSeparator());
        }
        sb.setLength(sb.length() - System.lineSeparator().length());
        return sb.toString();
    }
}
