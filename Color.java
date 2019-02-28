package termcolor;

/**
 * The colors that are available to color the text with.
 */
public enum Color {
    /** Foreground black color */
    FG_BLACK("\u001B[30m"),
    /** Foreground red color */
    FG_RED("\u001B[31m"),
    /** Foreground green color */
    FG_GREEN("\u001B[32m"),
    /** Foreground yellow color */
    FG_YELLOW("\u001B[33m"),
    /** Foreground blue color */
    FG_BLUE("\u001B[34m"),
    /** Foreground purple color */
    FG_PURPLE("\u001B[35m"),
    /** Foreground cyan color */
    FG_CYAN("\u001B[36m"),
    /** Foreground white color */
    FG_WHITE("\u001B[37m"),

    /** Background black color */
    BG_BLACK("\u001B[40m"),
    /** Background red color */
    BG_RED("\u001B[41m"),
    /** Background green color */
    BG_GREEN("\u001B[42m"),
    /** Background yellow color */
    BG_YELLOW("\u001B[43m"),
    /** Background blue color */
    BG_BLUE("\u001B[44m"),
    /** Background purple color */
    BG_PURPLE("\u001B[45m"),
    /** Background cyan color */
    BG_CYAN("\u001B[46m"),
    /** Background white color */
    BG_WHITE("\u001B[47m");

    private final String ansiCode;

    private Color(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String toString() {
        return this.ansiCode;
    }

}
