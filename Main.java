package com.age;

public class Main {
    public static void main(String[] args) {

      while (true){
          Retirement_age in = new Retirement_age();
          int age = in.myAge();
          if(age >= 65){
              System.out.println("You're lucky and can rest of your life happy!" + " Do you want to try again?");
          } else if (age > 0 && age <65) {
              int x = 65 - age;
              System.out.println("You need to work " + x + " years!" + " Do you want to try again?");
          } else if (age == 0)  {
              System.out.println("See you soon! :-)");
              break;
          }
      }
    }
}