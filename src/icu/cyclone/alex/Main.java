package icu.cyclone.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Type year: ");
            System.out.println(isLeapYear(sc.nextInt()) ? "is leap-year" : "is not leap-year");
            System.out.print("Again?(y/n): ");
            if (!sc.next().equals("y")) {
                break;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
