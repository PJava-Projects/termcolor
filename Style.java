package termcolor;

/**
 * The styles that are available to style the text with.
 */
public enum Style {
    /** Clear all styles and set colors to default (White on Black) */
    RESET("\u001B[0m"),

    /** Increase the intensity or make the text bold depending on terminal */
    BOLD("\u001B[1m"),
    /** Underline the text */
    UNDERLINE("\u001B[4m"),
    /** Swap foreground and background color */
    INVERSE("\u001B[7m");

    private final String ansiCode;

    private Style(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String toString() {
        return this.ansiCode;
    }
}
