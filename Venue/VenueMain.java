package com.Java_Practice.Getters_and_Setters.Venue;

import java.util.Scanner;

public class VenueMain {
    public static void main(String[] args) {
        Venue hyderabad = new Venue();
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the venue : ");
        String venuevenue = in.next();
        hyderabad.setVenue(venuevenue);
        System.out.print("Enter the city : ");
        String venuecity = in.next();
        hyderabad.setCity(venuecity);
        System.out.println(" The city is " + hyderabad.getCity() + " & " + " The venue is " + hyderabad.getVenue() + " ");

    }
}
