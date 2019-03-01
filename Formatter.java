package termcolor;

import java.awt.Color;
import java.util.EnumSet;

/**
 * This class provides methods for styling or coloring given strings.
 */
public class Formatter {

    /**
     * Format the string such that when printed, it would be printed with the wanted 
     * style.
     * @param style what style to format the given string with
     * @param s the string to style
     * @return the formatted string
     */
    public static String Style(Style style, String s) {
        return Style(EnumSet.of(style), s);
    }

    /**
     * Format the string such that when printed, it would be printed with the wanted 
     * styles.
     * @param styles what styles to format the given string with
     * @param s the string to style
     * @return the formatted string
     */
    public static String Style(EnumSet<Style> styles, String s) {
        StringBuffer sb = new StringBuffer();
        for(Style style: styles) {
            sb.append(style);
        }
        sb.append(s);
        sb.append(Style.RESET);
        return sb.toString();
    }

    /**
     * Format the string such that when printed, it would be printed with the wanted 
     * color.
     * @param color what color to format the given string with
     * @param s the string to color
     * @return the formatted string
     */
    public static String Color(Color color, String s) {
        return Color(EnumSet.of(color), s);
    }

    /**
     * Format the string such that when printed, it would be printed with the wanted
     * colors.
     * @param colors what colors to format the given string with
     * @param s the string to color
     * @return the formatted string
     */
    public static String Color(EnumSet<Color> colors, String s) {
        StringBuffer sb = new StringBuffer();
        for(Color color: colors) {
            sb.append(color);
        }
        sb.append(s);
        sb.append(Style.RESET);
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println(a);
        System.out.println(Formatter.Color(EnumSet.of(Color.FG_YELLOW, Color.BG_RED), a));
        System.out.println(Formatter.Style(Style.UNDERLINE, a));
    }
    
}
