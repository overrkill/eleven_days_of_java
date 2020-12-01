package com.company;

public class DayFive {

    public static void zorin(int num) throws ArrayIndexOutOfBoundsException {
        try {
            int num2 = 10 / num;
        } catch (Exception e) {
            System.out.println(e);
        }
        int[] arr = {1, 2, 4, 5};
        System.out.println(arr[5]);
    }

    public static void main(String... args) {
//        try{
//            String myString = String.valueOf(1/0);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Finally done");
//        }
//        System.out.println("done ");

        try {
            zorin(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        String a = "a";
        String b = new String(a);
        System.out.println((a == b) + " " + (a.equals(b)));
        if (10 < 1) {

        } else if (1 > 2) {
        }
    }
}
