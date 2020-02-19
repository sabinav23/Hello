package com.company;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
        String str = "Fantastic";
        System.out.println(str.charAt(6));
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

//2.Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().
        /* Print Hello + name
        public class Main {

            public static void main(String[] args) {
                printMyName();
            }

            public static void printMyName() {
                System.out.println("Hello \n Sabina");
            }
        }
        */
        /* Suma
        public class Main {

            public static void main(String[] args) {
                int a = 10;
                int b = 12;
                printSum(a,b);
            }

            public static void printSum(int a, int b) {
                System.out.println("Suma numerelor este: " +(a+b));
            }
        }
        */
        /*Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula
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
        */
        /*Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
        public class Main {
            public static void main(String[] args) {
                System.out.println("Sum result is: " + printSum(5, 10));
            }

            public static int printSum(int firstNumber, int secondNumber) {
                int result = firstNumber + secondNumber;
                return result;
            }
        }
        public class Main {
            public static void main(String[] args) {
                System.out.println(" Subtraction result is: " + printSubtraction(5, 10));
            }

            public static int printSubtraction(int firstNumber, int secondNumber) {
                int result = firstNumber - secondNumber;
                return result;
            }
        }
        public class Main {

            public static void main(String[] args) {
                System.out.println("Result is: " + printDiv(12, 2));
            }

            public static int printDiv(int firstNumber, int secondNumber) {
                int result = firstNumber / secondNumber;
                return result;
            }
        }
        public class Main {

            public static void main(String[] args) {
                System.out.println("Result is: " + printMultiplication(12, 2));
            }

            public static int printMultiplication(int firstNumber, int secondNumber) {
                int result = firstNumber * secondNumber;
                return result;
            }
        }
        */
        /*Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
        public class Main {

            public static void main(String[] args) {
                System.out.println("Result is: " + printMedia(5,10,20));
            }

            public static int printMedia(int firstNumber, int secondNumber, int thirdNumber) {
                int result = (firstNumber + secondNumber + thirdNumber) / 3;
                return result;
            }
        }
        */
        /*Scrieti o metoda java, care sa returneze restul impartirii a doua numere
        public class Main {

            public static void main(String[] args) {
                System.out.println("Result is: " + printRemainder(7, 5));
            }

            public static int printRemainder(int firstNumber, int secondNumber) {
                int result = firstNumber % secondNumber;
                return result;
            }
        }
        */
        /*Scrieti o metoda java, care sa afiseze urmatorul model:


        public class Main {

            public static void main(String[] args) {
                printJava();
            }

            public static void printJava() {

                for(int i = 1; i<= 4; i++){
                        if (i == 1) {
                            System.out.print("   J    a   V     V  a");
                        }
                        if (i == 2) {
                            System.out.print("   J   a a   V   V  a a");
                        }
                        if (i == 3) {
                            System.out.print("J  J  aaaaa   V V  aaaaa");
                        }
                        if (i == 4) {
                            System.out.print(" JJ  a     a   V  a     a");
                        }
                    System.out.println();
                }
            }
        }
         */
        /*1. Write a Java program to append the specified element to the end of a hash set
          2. Write a Java program to iterate through all elements in a hash list
        public class Main {

            public static void main(String[] args) {

                HashMap<Integer, String> firstHashMap = new HashMap<Integer, String>();

                firstHashMap.put(1, "Eu");
                firstHashMap.put(2, "Toteu");
                Iterator it = firstHashMap.entrySet().iterator();
                while(it.hasNext()){
                    HashMap.Entry pair= (HashMap.Entry)it.next();
                    System.out.println(pair.getKey() + " = " + pair.getValue());
                }

            }
        }
         */
        /*  3. Write a Java program to get the number of elements in a hash set
        public class Main {

            public static void main(String[] args) {

                int i = getNumberOfElements();
                System.out.println("Number of elements = " + i);

            }

            public static int getNumberOfElements() {
                HashMap<Integer, String> firstHashMap = new HashMap<Integer, String>();
                int i = 0;
                firstHashMap.put(1, "Eu");
                firstHashMap.put(2, "Toteu");
                firstHashMap.put(3, "TotEuTotEu");
                Iterator it = firstHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i++;
                    it.next();
                }
                return i;
            }
        }
         */
        /*4. Write a Java program to empty an hash set
        public class Main {

            public static void main(String[] args) {
                emptyHashSet();
            }

            public static void emptyHashSet() {
                HashSet hs = new HashSet();
                hs.add("Eu");
                hs.add("tot");
                hs.add("Eu");

                hs.clear();
            }
        }
         */
        /* 5. Write a Java program to test a hash set is empty or not
         public class Main {

            public static void main(String[] args) {
                emptyHashSet();
            }

            public static void emptyHashSet() {
                HashSet hs = new HashSet();
                hs.add("Eu");
                hs.add("tot");
                hs.add("Eu");

                hs.clear();

                if(hs.isEmpty()){
                    System.out.println("IS EMPTY!");
                }
                else{
                    System.out.println("IS NOT EMPTY!");
                }
            }
        }
         */
        /* 6. Write a Java program to clone a hash set to another hash set
        public class Main {
            public static void main(String[] args) {
                cloneHashSet();
            }

            public static void cloneHashSet() {
                HashSet hs = new HashSet();
                hs.add("Eu");
                hs.add("tot");
                hs.add("Siiii");

                HashSet hashSet = (HashSet) hs.clone();
                for(Object a: hashSet){
                    System.out.println(a);
                }
            }
        }
         */
        /* 7. Write a Java program to compare two hash set
        public class Main {

            public static void main(String[] args) {
                compareHashSet();
            }

            public static void compareHashSet() {
                HashSet<Integer> hs = new HashSet<Integer>();
                hs.add(1);
                hs.add(2);
                hs.add(3);

                HashSet<Integer> hashSet = new HashSet<Integer>();
                hashSet.add(3);
                hashSet.add(2);
                hashSet.add(1);

                if(hs.equals(hashSet)){
                    System.out.println("HashSets are equal");
                }
                else{
                    System.out.println("HashSets are not equal");
                }
            }
        }
         */
        /* 8. Write a Java program to remove all of the elements from a hash set
        public class Main {
            public static void main(String[] args) {
                removeAllElements();
            }

            public static void removeAllElements() {
                HashSet<Integer> hs = new HashSet<Integer>();
                hs.add(1);
                hs.add(2);
                hs.add(3);

                HashSet<Integer> hashSet = new HashSet<Integer>();
                hashSet.add(1);
                hashSet.add(2);

                hs.removeAll(hashSet);

                for(Object a: hs){
                    System.out.println(a);
                }
            }
        }
         */

        //STRINGS

        /*Create an empty StringBuffer
            Append “blessings”
            Insert “Good ” in the begging
            Delete the first o
            Append “ be with you”
            Set length to 3
        public class Main {

            public static void main(String[] args) {
                createStringBuffer();
            }

            public static void createStringBuffer() {
                StringBuffer sBuffer = new StringBuffer("test");
                sBuffer.append("blessings");

                sBuffer.insert(0, "Good");
                sBuffer.deleteCharAt(2);
                sBuffer.append("be with you");
                sBuffer.setLength(3);
                System.out.println(sBuffer);
            }
        }
         */
        /* Create a printDetails method, that takes a StringBuilder parameter, and prints the content, length and capacity of the StringBuilder, all on a new line
        public class Main {

            public static void main(String[] args) {
                StringBuilder sBuilder = new StringBuilder(50);
                sBuilder.append("Wow ce tare!");
                printDetails(sBuilder);
            }

            public static void createStringBuffer() {
                StringBuffer sBuffer = new StringBuffer("test");
                sBuffer.append("blessings");

                sBuffer.insert(0, "Good");
                sBuffer.deleteCharAt(2);
                sBuffer.append("be with you");
                sBuffer.setLength(3);
                System.out.println(sBuffer);
            }

            public static void printDetails(StringBuilder sBuilder){
                System.out.println("String content: " + returnContent(sBuilder));
                System.out.println("String length: " + sBuilder.length());
                System.out.println("String capacity: " + sBuilder.capacity());
            }
            public static StringBuilder returnContent(StringBuilder sBuilder){
                return sBuilder;
            }
        }
         */
        /*

         */



