package com.age;

import java.util.Scanner;

public class Retirement_age {

        int myAge () {
        System.out.println("What are you age?\n" + "If you want exit write - 0");
        Scanner in = new Scanner(System.in);
        int enterAge = in.nextInt();
        return enterAge;
    }

}
