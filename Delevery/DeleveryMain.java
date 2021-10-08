package com.Java_Practice.JAVA_Practices.Delevery;

import java.util.Scanner;

public class DeleveryMain {
    public static void main(String[] args) {
        Delevery playergame = new Delevery();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter game overs : ");
        float gameovers = in.nextFloat();
        playergame.setOvers(gameovers);

        System.out.print("Enter game balls : ");
        int gameballs = in.nextInt();


        System.out.print("Enter game runs : ");
        int gameruns = in.nextInt();

        Delevery balls  = new Delevery(gameballs,gameruns);

        System.out.println("The overs are : " + " " + playergame.getOvers() + " The balls are : " + gameballs + " The runs are : " + gameruns);
    }
}
