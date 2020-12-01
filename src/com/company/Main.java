package com.company;

import java.util.Scanner;

public class Main {

    String iv = "Instance Variable";
    // Scopes
    // Instance Variable needs to have an object or static
    Integer a = Integer.valueOf("1"); // this works
    public  void abc(){
        String iv = "Method variable";
        System.out.println(iv);
    }
    public static void main(String[] args) {
    //Basic User I/O

        try {
            int ex = Integer.parseInt("10");
            System.out.println(ex);
        }
        catch (Exception e){
            System.out.println(e);
        }


        Scanner reader =  new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println(a);
	// write your code here
        Main o1 = new Main();
        o1.abc();
        System.out.println(o1.iv);
        System.out.println("Hello World!" + o1.iv);
        for (int i = 0;i<10;){
            System.out.println((++i)+" Hello");
        }

    }
}
