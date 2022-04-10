package edu.sandbox.samples.labyrinth;

public record Labyrinth(boolean[][] field) {

    public static void main(String... args) {
        Labyrinth.withSides(9, 15).walkThrough();
    }

    public static Labyrinth withSides(int length, int width) {
        return new Labyrinth(new boolean[length][width]);
    }

    public void walkThrough() {
        var direction = Direction.RIGHT;
        for(int x = 0, y = 0;
            centerNotReached(x, y);
            x = direction.guessX(x, 1), y = direction.guessY(y, 1))
        {
            System.out.printf("Go %s to x=%d, y=%d\n", direction, x, y);
            if(cannotGoForward(direction, x, y)) direction = direction.change();
            field[y][x] = true;
        }
        System.out.println("Map of passed labyrinth:\n" + this);
    }

    private boolean centerNotReached(int x, int y) {
        return positionIsNotCentral(x, field[0].length) || positionIsNotCentral(y, field.length);
    }

    private boolean positionIsNotCentral(int pos, int bound) {
        int diff = pos - (bound >> 1);
        return diff < 0 || diff > 1;
    }

    private boolean cannotGoForward(Direction direction, int x, int y) {
        return !fieldAllowsMoving(direction, x, y, 0) || cellAheadIsPassed(direction, x, y);
    }

    private boolean cellAheadIsPassed(Direction direction, int x, int y) {
        return fieldAllowsMoving(direction, x, y, 1)
                && field[direction.guessY(y, 2)]
                        [direction.guessX(x, 2)];
    }

    private boolean fieldAllowsMoving(Direction direction, int x, int y, int edgeOffset) {
        return (!direction.offsetsX() || positionFits(direction, x, field[0].length, edgeOffset))
                && (direction.offsetsX() || positionFits(direction, y, field.length, edgeOffset));
    }

    private boolean positionFits(Direction direction, int pos, int bound, int edgeOffset) {
        return pos < bound - edgeOffset - 1 && (direction.increases() ? pos >= edgeOffset : pos > edgeOffset);
    }

    @Override
    public String toString() {
        String filled = "\u2588", empty = "\u2591";
        StringBuilder sb = new StringBuilder();
        for(boolean[] row : field) {
            for(boolean cell : row) {
                sb.append(cell ? filled : empty);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
