package termcolor;

import java.util.EnumSet;

/**
 * This class provides methods for writing to stdout using colored text and/or styled
 * text.
 */
public class Writer {

    public Writer() {
        
    }

    /**
     * Print the given string in the given color and don't end with a newline.
     * @param color what color to print the string in
     * @param s the string to print
     */
    public void write(Color color, String s) {
        System.out.print(color);
        System.out.print(s);
        System.out.print(Style.RESET);
    }

    /**
     * Print the given string in the given foreground color and background color and 
     * don't end with a newline.
     * @param fgColor what foreground color to print the string in
     * @param bgColor what background color to print the string in
     * @param s the string to print
     */
    public void write(Color fgColor, Color bgColor, String s) {
        System.out.print(fgColor);
        System.out.print(bgColor);
        System.out.print(s);
        System.out.print(Style.RESET);
    }

    /**
     * Print the given string in the given style.
     * @param style what style to print the string in
     * @param s the string to print
     */
    public void write(Style style, String s) {
        write(EnumSet.of(style), s);
    }

    /**
     * Print the given string in the given styles.
     * @param styles the set of styles used to style the text
     * @param s the string to print
     */
    public void write(EnumSet<Style> styles, String s) {
        for(Style style: styles) {
            System.out.print(style);
        }
        System.out.print(s);
        System.out.print(Style.RESET);
    }

    /**
     * Print the given string in the given color and style and don't end with a newline.
     * @param style what style to print the string in
     * @param color what color to print the string in
     * @param s the string to print
     */
    public void write(Style style, Color color, String s) {
        write(EnumSet.of(style), EnumSet.of(color), s);
    }

    /**
     * Print the given string in the given styles and colors and don't end with a newline.
     * @param styles the set of styles used to style the text
     * @param colors the set of colors used to color the text
     * @param s the string to print
     */
    public void write(EnumSet<Style> styles, EnumSet<Color> colors, String s) {
        for(Color color: colors) {
            System.out.print(color);
        }
        write(styles, s);
    }

    /**
     * Print the given string in the given color and end with a newline.
     * @param color what color to print the string in
     * @param s the string to print
     */
    public void writeln(Color color, String s) {
        System.out.print(color);
        System.out.println(s);
        System.out.print(Style.RESET);
    }

    /**
     * Print the given string in the given foreground color and background color and end
     * with a newline.
     * @param fgColor what foreground color to print the string in
     * @param bgColor what background color to print the string in
     * @param s the string to print
     */
    public void writeln(Color fgColor, Color bgColor, String s) {
        System.out.print(fgColor);
        System.out.print(bgColor);
        System.out.println(s);
        System.out.print(Style.RESET);
    }

    /**
     * Print the given string in the given style and end with a newline.
     * @param style what style to print the string in
     * @param s the string to print
     */
    public void writeln(Style style, String s) {
        writeln(EnumSet.of(style), s);
    }

    /**
     * Print the given string in the given styles and end with a newline.
     * @param styles the set of styles used to style the text with
     * @param s the string to print
     */
    public void writeln(EnumSet<Style> styles, String s) {
        for(Style style: styles) {
            System.out.print(style);
        }
        System.out.println(s);
        System.out.print(Style.RESET);
    }

    /**
     * Print the given string in the given color and style and end with a newline.
     * @param style what style to print the string in
     * @param color what color to print the string in
     * @param s the string to print
     */
    public void writeln(Style style, Color color, String s) {
        writeln(EnumSet.of(style), EnumSet.of(color), s);
    }

    /**
     * Print the given string in the given colors and styles and end with a newline.
     * @param styles the set of styles used to style the text
     * @param colors the set of colors used to color the text
     * @param s the string to print
     */
    public void writeln(EnumSet<Style> styles, EnumSet<Color> colors, String s) {
        for(Color color: colors) {
            System.out.print(color);
        }
        writeln(styles, s);
    }

    public static void main(String[] args) {
        Writer w = new Writer();
        w.writeln(EnumSet.of(Style.UNDERLINE), EnumSet.of(Color.FG_YELLOW, Color.BG_RED), "Hello!");
        w.write(Color.FG_RED, Color.BG_YELLOW, "Hello World");
    }
    
}
