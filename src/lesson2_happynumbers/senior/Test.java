package lesson2_happynumbers.senior;

import lesson2_happynumbers.senior.tester.Tester;

public class Test {
    public static void main(String[] args) {
        Lucky lucky = new Lucky();
        Tester tester = new Tester(lucky, "/Users/i.gaisin/Downloads/A01_Счастливые_билеты-1801-057a77/1.Tickets/");
        tester.runTests();
    }
}
