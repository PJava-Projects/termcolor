package termcolor;

/**
 * This class provides methods for manipulating the cursor location and clearing parts
 * of the terminal contents.
 */
public class Movement {

    /**
     * Clear the screen and move the cursor to the top left.
     */
    public static void clearScreen() {
        System.out.printf("\033[2J");
        setCursorTo(0, 0);
    }

    /**
     * Clear the rest of the line that the cursor is on.
     */
    public static void clearRestOfLine() {
        System.out.printf("\033[K");
        System.out.flush();
    }

    /**
     * Move the cursor up n rows.
     * @param numTimes the number of rows to move up by
     */
    public static void setCursorUp(int numTimes) {
        System.out.printf("\033[%dA", numTimes);
        System.out.flush();
    }

    /**
     * Move the cursor down n rows.
     * @param numTimes the number of rows to move down by
     */
    public static void setCursorDown(int numTimes) {
        System.out.printf("\033[%dB", numTimes);
        System.out.flush();
    }

    /**
     * Move the cursor left n columns.
     * @param numTimes the number of columns to move left by
     */
    public static void setCursorLeft(int numTimes) {
        System.out.printf("\033[%dD", numTimes);
        System.out.flush();
    }

    /**
     * Move the cursor right n columns.
     * @param numTimes the number of columns to move right by
     */
    public static void setCursorRight(int numTimes) {
        System.out.printf("\033[%dC", numTimes);
        System.out.flush();
    }

    /**
     * Move the cursor to a specific row and column.
     * @param x the row to move the cursor to, starts with 0.
     * @param y the column to move the cursor to, starts with 0.
     */
    public static void setCursorTo(int x, int y) {
        System.out.printf("\033[%d;%dH", x, y);
        System.out.flush();
    }
    
}
