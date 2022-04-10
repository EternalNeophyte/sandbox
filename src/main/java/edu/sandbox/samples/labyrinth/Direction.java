package edu.sandbox.samples.labyrinth;

public enum Direction {

    LEFT(true, false),
    UP(false, false),
    RIGHT(true, true),
    DOWN(false, true);

    private final boolean offsetsX;
    private final boolean increases;

    Direction(boolean offsetsX, boolean increases) {
        this.offsetsX = offsetsX;
        this.increases = increases;
    }

    public Direction change() {
        return switch (this) {
            case LEFT -> UP;
            case UP -> RIGHT;
            case RIGHT -> DOWN;
            case DOWN -> LEFT;
        };
    }

    public boolean offsetsX() {
        return offsetsX;
    }

    public boolean increases() {
        return increases;
    }

    public int guessX(int x, int offset) {
        return offsetsX ? guess(x, offset) : x;
    }

    public int guessY(int y, int offset) {
        return offsetsX ? y : guess(y, offset);
    }

    private int guess(int start, int offset) {
        return increases ? start + offset : start - offset;
    }

}
