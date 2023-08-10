package game;

public interface Board {
    Position getPosition();

    public boolean isValid(Move move);

    GameResult makeMove(Move move);
}
