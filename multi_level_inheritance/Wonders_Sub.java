package com.Java_Practice.multi_level_inheritance;

import java.util.Scanner;

    public class Wonders_Sub extends WondersMain{
        private String constructed_by;

        public String getConstructed_by() {
            return constructed_by;
        }

        public void setConstructed_by(String constructed_by) {
            this.constructed_by = constructed_by;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // Wonderplace
            System.out.print("Enter the place of wonder : ");
            String Wonder_Place = in.next();
            Wonders_Sub Wonders = new Wonders_Sub();
            Wonders.setPlace(Wonder_Place);

            //wondername
            System.out.print("Enter the name of wonder : ");
            String Wonder_Name = in.next();
//            Wonders_Sub Wonders_name = new Wonders_Sub();
            Wonders.setName(Wonder_Name);

            //wonder_constructed_by
            System.out.print("Enter the wonder constructed by : ");
            String Wonder_Constructedby = in.next();
//            Wonders_Sub Wonders_Constructedby = new Wonders_Sub();
            Wonders.setConstructed_by(Wonder_Constructedby);

            //no.of_times_wonder_Visited
            System.out.print("Enter the number of times visited : ");
            int Wonder_visit = in.nextInt();
//            Wonders_Sub Wonders_visits = new Wonders_Sub();
            Wonders.setVisit(Wonder_visit);

            System.out.println("     ");

            System.out.println("The place of wonder is : " + Wonders.getPlace());
            System.out.println("The Name of wonder is : " + Wonders.getName());
            System.out.println("The wonder constructed by is : " + Wonders.getConstructed_by());
            System.out.println("The number of times visited is : " + Wonders.getVisit());
        }
   }
