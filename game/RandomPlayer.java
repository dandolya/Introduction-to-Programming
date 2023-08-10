package game;

import java.util.Random;

public class RandomPlayer implements Player {
    int m, n;

    public RandomPlayer(int m, int n) {
        this.m = m;
        this.n = n;
    }
    private final Random random = new Random();

    @Override
    public Move makeMove(Position position) {
        while (true) {
            final Move move = new Move(
                    random.nextInt(m),
                    random.nextInt(n),
                    position.getTurn()
            );
            if (position.isValid(move)) {
                return move;
            }
        }
    }
}
