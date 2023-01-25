package com.age;

public class Main {

    public static void main(String[] args) {

        Retirement_age in = new Retirement_age();

         while (true){
          int age = in.myAge();
          if(age >= 65){
              System.out.println("You're lucky and can rest of your life happy!" + " Do you want to try again?\n");
          } else if (age > 0 && age <65) {
              int x = 65 - age;
              System.out.println("You need to work " + x + " years!" + " Do you want to try again?\n");
          } else if (age < 0) {
              System.out.println("You've mistake!\n");
          } else if (age == 0)  {
             System.out.println("See you soon! :-)\n");
             break;
          }
      }

}
}