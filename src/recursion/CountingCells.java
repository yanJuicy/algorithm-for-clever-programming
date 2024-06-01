package recursion;

public class CountingCells {

    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;

    private static int N = 8;
    private static int[][] grid = {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 1, 1},
    };

    public static void main(String[] args) {
        int count = new CountingCells().countCells(5, 3);
        System.out.println("count = " + count);
    }

    public int countCells(int x, int y) {
        int result = 0;

        if (x < 0 || x >= N || y < 0 || y >= N) {
            result = 0;
        } else if (grid[x][y] != IMAGE_COLOR) {
            result = 0;
        } else {
            grid[x][y] = ALREADY_COUNTED;
            result = 1 +
                    countCells(x - 1, y + 1) +
                    countCells(x, y + 1) +
                    countCells(x + 1, y + 1) +
                    countCells(x - 1, y) +
                    countCells(x + 1, y) +
                    countCells(x - 1, y - 1) +
                    countCells(x, y - 1) +
                    countCells(x + 1, y - 1);
        }

        return result;
    }
}
