package com.company;


import java.util.Scanner;

public class Main { // turi sutapti su failu pavadinimu (klase)
    public static void main(String[] args) {


        int[] newArray = new int[30];

        for (int i = 0; i < newArray.length; i++) {
            int random = (int) (Math.random() * 20) + 5;
            newArray[i] = random;
        }
        int tens = 0;
        for (int n = 0; n < newArray.length; n++) {
            System.out.print(newArray[n]+ " ");
            if (newArray[n] > 10) {
                tens += 1;
            }
        }
        System.out.print("\nMore then 10 are " + tens);



//        SORTING
        int[] randomArray = {20, 40, 33, 3, 88, 546, 9, 2, 4, 76, 3, 7987, 434};

//        for (int i = 0; i < ; i++) {
//
//        }
//          Dalyku rusiavimas
        for (int a = 0; a < randomArray.length ; a++) {
            for (int i = 0; i < randomArray.length - 1 ; i++) {
                    if (randomArray[i] > randomArray[i + 1]) {
                        int tmp = randomArray[i];
                        randomArray[i] = randomArray[i + 1];
                        randomArray[i + 1] = tmp;
                    }
            }
        }
        System.out.println();
        for (int x = 0; x < randomArray.length; x++) {
            System.out.print(randomArray[x]+ " ");

        }
        System.out.println();
        System.out.println("Highest value is " + randomArray[randomArray.length - 1]);
//         C

        int sum = 0;
        for (int x = 0; x < randomArray.length; x++) {
            if (randomArray[x] % 2 == 0) {
                sum += randomArray[x];
            }
        }
        System.out.print("bendra suma lyginiu skaiciu " + sum);
        System.out.println();
//        D


        for (int x = 0; x < randomArray.length; x++) {
            System.out.print(randomArray[x] * -1 + " ");
            }
        System.out.println();
//        E


        int[] newArray10 = new int[newArray.length + 10];
        for (int i = 0; i < newArray10.length; i++) {
            int random = (int) (Math.random() * 20) + 5;
            newArray10[i] = random;
        }
        for (int i = 0; i < newArray10.length; i++) {
            System.out.print(newArray10[i] + " ");

        }
        System.out.println();
        int[] poriniai = new int[50];
        int[] neporiniai = new int[50];
        for (int i = 0; i < newArray10.length; i++) {
            if (newArray10[i] % 2 == 0) {
                poriniai[i] = newArray10[i];
            }else{
                neporiniai[i] = newArray10[i];
                }
            }
        for (int i = 0; i < poriniai.length; i++) {
            System.out.print(poriniai[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < neporiniai.length; i++) {
            System.out.print(neporiniai[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            if ( newArray[i] > 15 ) {
                newArray[i] = 0;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }











    }
}
