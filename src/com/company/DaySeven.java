package com.company;


import java.util.ArrayList;
import java.util.Collections;

//Author class
class Author implements Comparable<Author> {
    String firstName;
    String lastName;
    String bookName;
    Author(String first, String last, String book){
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
    }


    public int compareTo(Author au){

        int last = this.bookName.compareTo(au.bookName);

        return last == 0 ? this.firstName.compareTo(au.firstName) : last;
    }
}


public class DaySeven{

    public static void main(String... args){
        System.out.println("Day Seven"+args.length );
        ArrayList<Author> al= new ArrayList<>();
        al.add(new Author("hari","prasath", "Ponniyin selvan"));
        al.add(new Author("dinesh","kumar", "Udayar"));


        Collections.sort(al);
        for(Author str:al){
            System.out.println(str.firstName+" "+
                    str.lastName+" "+"Book: "+str.bookName);
        }


    }
}
