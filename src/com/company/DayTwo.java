package com.company;

import java.util.Random;
//import java.util.Scanner;
//Day Two
//arrays n some gc,  wrapper class
public class DayTwo {
        //Test gc
        public void play(){
            System.out.print("play-");
        }
        public static void testGc(){
            DayTwo o1 = new DayTwo();
            o1.play();
            System.gc();
            DayTwo o2  = new DayTwo();
            o2.play();
        }
        public static  void  main(String[] args){
            //look for logical correctness
            //Prime number program
            System.out.println("Day Two");
//            Scanner  reader = new Scanner(System.in);
            Random rd = new Random();
            int[] Students  = new int[10] ;

            for(int i=0;i<10;i++){
                Students[i] = rd.nextInt(100);
            }
            for(int i=0;i<10;i++){
                System.out.println(Students[i]);
            }
            int mx=0 , mn=999, sum=0,sm=0,sn=0;
            for(int i=0;i<10;i++){
                if(Students[i]<=mn){
                    mn =Students[i];
                    sm=i;
                }
                if (Students[i]>=mx){
                    mx = Students[i];
                }
                sum+=Students[i];
                sn=i;
            }
            System.out.println("Avg "+sum/10+" Max "+mx+"Scored by student "+sm+" Min "+mn+" scored by "+sn);
            System.gc();
            System.out.println("Test for gc \n");
            testGc();
        }
}
//    Day Two
//        59
//        39
//        45
//        8
//        1
//        90
//        65
//        67
//        2
//        37
//        Avg 41 Max 90 Min 1


// Design story board
// decide how many vars name the  variables logically
// write pseudo code

//Declare sumOfElements initialize to zero
//Accept inputs if n\array not given*
//iterate over each array alement and add to sumOfElements
//Print sumOfElements