package com.medium.java13;

/**
 * @author ragcrix
 */
public class SwitchExpressions {

    @SuppressWarnings("preview")
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                break;
            case TUESDAY:
                System.out.println(7);
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println(8);
                break;
            case WEDNESDAY:
                System.out.println(9);
                break;
            default:
                System.out.println(-1);
        }

        // from java 13 onwards - multi-label case statements
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY:
                System.out.println(6);
                break;
            case TUESDAY:
                System.out.println(7);
                break;
            case THURSDAY, SATURDAY:
                System.out.println(8);
                break;
            case WEDNESDAY:
                System.out.println(9);
                break;
            default:
                System.out.println(-1);
        }

        // switch expressions, use yield to return, in Java 12 it was break
        int x = switch (day) {
            case MONDAY, FRIDAY, SUNDAY:
                yield 6;
            case TUESDAY:
                yield 7;
            case THURSDAY, SATURDAY:
                yield 8;
            case WEDNESDAY:
                yield 9;
            default:
                yield -1;
        };
        System.out.println("x = " + x);

    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}