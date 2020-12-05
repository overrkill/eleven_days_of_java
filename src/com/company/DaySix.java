package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class RealThread extends Thread{
    public void run(){
        System.out.println("Im a Thread from Thread");
    }
}

class RunnableThread implements Runnable{
    public void run(){
        System.out.println("Im a runnable Thread");
    }
}



//Comparator

class STU
{
    int rollno,age;
    String name;
    public STU(int rollno,int age, String name)
    {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return this.rollno+""+this.age+""+this.name;
    }
}
class SortbyRoll implements Comparator<STU>
{
public int compare(STU a,STU B)
        {
        return a.rollno - B.rollno;
        }
        }
class SortByName implements Comparator<STU>
{
    public int compare(STU a,STU B)
    {
        return a.name.compareTo(B.name);
    }
}


public class DaySix {

    public static void main(String... args){

        //Array List  for dynamic size array
        ArrayList<STU> ar = new ArrayList<STU>();
        ar.add(new STU(1,18,"Smith"));
        ar.add(new STU(3,48,"John"));
        ar.add(new STU(2,16,"John"));
        ar.add(new STU(5,33,"Steve"));
        ar.add(new STU(7,32,"Bob"));

        System.out.println("Age Name Rollno");
        System.out.println("without sorting");
        for (int i=0;i<ar.size();i++)
            System.out.println(ar.get(i).age +" "+ar.get(i).name + " "+ar.get(i).rollno);


        //Doing Comparators
        Collections.sort(ar, new SortByName());
        System.out.println("with Name sorting");
        for (int i=0;i<ar.size();i++)
            System.out.println(ar.get(i).age +" "+ar.get(i).name + " "+ar.get(i).rollno);

        Collections.sort(ar, new SortbyRoll());
        System.out.println("with Rollno sorting");
        for (int i=0;i<ar.size();i++)
            System.out.println(ar.get(i).age +" "+ar.get(i).name + " "+ar.get(i).rollno);


        //implementing threads basics
        RunnableThread obj2 = new RunnableThread();
        Thread obj3 = new Thread(obj2);
        obj3.start();
        RealThread obj = new RealThread();
        obj.start();
        System.out.println("Main Thread");



    }
}
