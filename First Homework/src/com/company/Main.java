package com.company;

public class Main {
///create static methods here
public static int myIntergerMethod(int interger) {
    return interger;
}
public static  double discount (double finals) {
    return finals;
}
    public static int other (int remainder) {
        return remainder;
    }
public static double square (double squared){
    return squared;
        }
        public static String lengthOfStringMethod(String lengths){
    return "LearningJavaIsFun";
        }




    public static void main(String[] args) {
        //use static methods
        /*#1
        dog + fish = 25
        dog + bird = 35
        bird + fish = 30
        dog + bird + fish = 45
        */

        //#2
        int b = 5;
        int y = 5 * b + 100;
        System.out.println(y);
        /*#3
        x = 3x + x2 - 5
        x + 5 = 3x + x2
        x + 2.5 = 3x + x
        x/x + 2.5 = 3x
        1+2.5=3x
        x =1.166
        */

        //#4
        String firstName = "Dallas";
        String lastName = "Griffith";
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        //#5
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println(array1[3] * array2[1] / array1[1]);

        //#6
        String sentence = "It was all a dream, used to read wuddup magazines.";
        String output = sentence.substring(38, 39).toUpperCase();
        System.out.println(output);
        //#7
        int area = 375;
        int height = 25;
        int answer = 375 * 2 / 25;
        System.out.println(answer);
        //#8
        System.out.println(myIntergerMethod(1007));
        //#9
        //#10
        System.out.println(other(118/31));
        //#11
        System.out.println(square(Math.pow(5, 2)));
        //#12
        for (int x = 1; x <= 20; x++) {
            if (x == 20) {
                break;

            }
            System.out.println(x);
            //#13
            int g = 10;
            do {
                System.out.println(g);
                g++;
            }
            while (g >= 5);
            //#14
            for (int i = 5; i < 45; i++) {
                i = i + 4;
            }
            //#15
            //f(54, 48)

            //#16
            int[] arrayOfNumbers = {12, 4, 67, 8, 90, 23, 4};
            System.out.println(arrayOfNumbers[2+6]);
            System.out.println(arrayOfNumbers[1+2+3+4+5+6+7]/7);
            arrayOfNumbers.add(5);
            System.out.println(arrayOfNumbers);
            //#17
            String[] artist = {"gherbo" + "lil durk", "Meek mill", "Lud foe", "juice wrld", "Pnb rock"};
            System.out.println(artist);
            //#18

            //#19
            System.out.println("Your finial is " + (discount(100%.1)));
            //#20



        }
    }
}
