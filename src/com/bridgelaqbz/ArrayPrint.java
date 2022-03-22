package com.bridgelaqbz;

public class ArrayPrint{
        public static <T extends Comparable<T>> void genericSortMethod(T[] arr) {   // Generic method extending to Comparable with generic array as parameter.

            T temp;
            for(int i = 0 ; i<arr.length;i++) {                       //Sorting logic
                for(int j = 0 ;j<arr.length-1;j++) {

                    if(arr[j].compareTo(arr[j+1])<0) {
                        temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]=temp;

                    }

                }
            }for(int i = 0 ; i<arr.length;i++) {
                System.out.println(arr[i]);
            }

        }


        public static void main(String[] args) {                //Main Method

            Integer[] intArray = {53,23,65,25,85,63};               //Integer array sort
            genericSortMethod(intArray);

            System.out.println(" ");

            Double[] doubleArray = {7.6,2.5,4.5,9.0,1.6};           //Double array sort
            genericSortMethod(doubleArray);

            System.out.println(" ");

            String[] stringArray = {"Peach","Apple","Orange","Banana","Mango"};   //String array sort
            genericSortMethod(stringArray);
        }
}

