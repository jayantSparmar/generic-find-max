package com.bridgelaqbz;

public class ArrayPrint{<T extends Comparable<T>> {
    /*
     * Find Maximum Problem using Generic.
     */

    //Global variables
    T x, y, z;

    public ArrayPrint(T x, T y, T z) {
        //Assigning values
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        //Local variables.
        Integer num1 = 27;
        Integer num2 = 50;
        Integer num3 = 97;

        Float number1 = 98.4f;
        Float number2 = 67.9f;
        Float number3 = 56.4f;

        String name1 = "Jayant";
        String name2 = "Singh";
        String name3 = "Parmar";

        /*
         * Calling constructor through object creation.
         * Calling maximum method through object reference variable.
         */
        ArrayPrint<Integer> printMaxInteger = new ArrayPrint<>(num1, num2, num3);
        printMaxInteger.maximum();

        ArrayPrint<Float> printMaxFloat = new ArrayPrint<>(number1, number2, number3);
        printMaxFloat.maximum();

        ArrayPrint<String> printMaxString = new ArrayPrint<>(name1, name2, name3);
        printMaxString.maximum();

    }

    /*
     * Generic method to find the maximum value.
     */
    public static <T extends Comparable<T>> T testMax(T x, T y, T z) {

        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    /*
     * Printing the maximum value
     */
    public static <T> void printMax(T x, T y, T z, T maximum) {
        System.out.printf("Max of %s, %s and %s is %s \n", x, y, z, maximum);
    }

    public T maximum() {
        //calling tsetMax method
        return ArrayPrint.testMax(x, y, z);
    }
}

        

