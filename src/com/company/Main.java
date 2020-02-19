package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 1598;
        int b = 3;
        printResult(a, b);
    }

    public static void printResult(int a, int b) {
        double div = (double)a/b;
        System.out.println("A/B equals  " + div);
    }
}
       /* Mai mic mai mare
        int a = 4;
        int b = 5;
        int c = 2;

        if(a < b && a < c){
            System.out.println("A e cel mai mic");
        }
        else if(b < a && b < c){
            System.out.println("B e cel mai mic");
        }
        else{
            System.out.println("C e cel mai mic");
        }

        */
        /*   Upper case or not
        char act = 'D';

        if (act >= 65 && act <= 90) {
            System.out.println("the char is upper case");
        }
        else{
            System.out.println("the char is not upper case");
        }

         */

        /*int year = 1508;
        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 == 0){
                System.out.println("is leap");
            }
            else{
                System.out.println("mnot");
            }
        }
         */

        //int year = 104;
        /*
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap ");
        }
        else{
            System.out.println("Not a leap year!");
        }
        */
        /* Leap year cu metoda in alta clasa
        LogicalOp logicalOp = new LogicalOp();

        System.out.println(logicalOp.isLeapYear(year));
        */

        /* compare words
        Scanner keyboard = new Scanner(System.in);
        String word1 = keyboard.next();
        String word2 = keyboard.next();

        Words words = new Words();
        words.isTheSame(word1, word2);

         */

        /* Print the first 100 even numbers
        int i = 0;
        while(i <= 99){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        */

        /* Print the reverse of a given number (123 → 321)
        int n = 12345;
        int nr = 0;
        while(n != 0){
            nr = nr * 10 +  n%10;
            n /= 10;
        }
        System.out.println(nr);
        */

        /*
        int n = 6;
        int a = n;
        Using 2 for loops, produce the output shown below:
******
*****
****
***
**
*
         Method 1
        for (int i = 1; i <= n; i++) {
            for (int j = a; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
        */
        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i + j <= n){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
         */

        /* Fibonacci
        int a = 0;
        int b = 1;
        System.out.println(a +" " + b);
        for(int i = 2; i <= 18; i++){
            int s = a + b;
            System.out.println(s);
            a = b;
            b = s;
        }
         */

        /*
        String word = "Zebra";
        int n = 2;
        char[] letters = word.toCharArray();
        for(int i = 0; i < letters.length; i++){
            letters[i] += n;
        }

        System.out.println(letters);
         */
        /* Print square root
        int myArray[] = new int[]{5 , 6 , 8, 9};
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i] * myArray[i]);
        }
         */


        //MOODLE
        /*Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        String name = "Sabina";
        System.out.println("Hello \n " + name);
         */
        /* Printati rezultatul sumei a doua numere(orice numere)
        int a = 10;
        int b = 12;
        System.out.println("Suma numerelor este: " + (a + b));
         */
        /* Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        int a = 1598;
        int b = 3;
        double div = (double)a/b;
        System.out.println(div);
         */

