package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<String>();
        boolean done = false;
        while(!done){
            System.out.println("enter your faviort movie");
            String movie = scan.nextLine();
            movies.add(movie);
            System.out.println("if you want sto push q");
            String yes = scan.nextLine();
            if(yes.equalsIgnoreCase("q"))
                done = true;
            else
                done = false;
        }
        System.out.println(movies);
        for(String mov:movies)
            System.out.println(mov);


	// write your code here
    }
}
