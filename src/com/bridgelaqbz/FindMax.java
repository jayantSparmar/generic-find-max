package com.bridgelaqbz;

public class FindMax {
    public static void main(String[] args) {
        System.out.println("welcome to the generic max problem solving statement");

        //UC-1

        //one = 52 ,two = 36,three = 86;  (Maximum Number is at 3rd Position).
        System.out.println(maximumIntegerMethod(52, 36, 86));
    }
    public static <T extends Comparable<T>> T maximumIntegerMethod(T one, T two, T three) {  //Return type of this method is <T> i.e Generic type with 3 parameters.

        T maximum = one;                   //1 : Initially we assume that 'maximum' is 'one'.

        if (two.compareTo(one) > 0) {       //2 : Then we use compareTo() method to test 'two' with previous 'maximum'-(i.e one).

            maximum = two;                  //Now updated maximum is 'two'.
        }

        if (three.compareTo(maximum) > 0) {  //3 : Then we use compareTo() method to test 'three' with previous 'maximum'-(i.e two).

            maximum = three;                //Now updated maximum is 'three'.
        }
        return maximum;                     //Finally returning the 'maximum'.

    }
}






