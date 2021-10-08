package com.Java_Practice.Java_Challanges.Player;

import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {
        Player newplayer = new Player();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playername = in.next();
        newplayer.setName(playername);

        System.out.print("Enter player country: ");
        String playercountry = in.next();
        newplayer.setCountry(playercountry);

        System.out.print("Enter player skills: ");
        String playerskills = in.next();
        newplayer.setSkill(playerskills);

        System.out.println(newplayer.getName() + " and " + newplayer.getCountry() + " and " + newplayer.getSkill() + " ");

    }
}
