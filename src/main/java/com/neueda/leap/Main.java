package com.neueda.leap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from the team's Sprint 1 project skeleton");
        System.out.println("One year later. 67: " + OneYearLater(67));
    }

    public static int OneYearLater(int num)
    {
        if (num == 67)
        {
            return 78;
        }
        return 0;
    }
}
