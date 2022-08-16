package task1Lambda;

import java.util.GregorianCalendar;

public enum Color {
    GREEN("Light GREEN"),RED("Heavy RED");


    public final String label;

    private Color(String label) {
        this.label = label;
    }

    public static void main(String[] args) {
        System.out.println( GREEN.label);
    }
}
