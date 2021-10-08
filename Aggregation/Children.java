package com.Java_Practice.Aggregation;

import java.util.Scanner;

public class Children {
        private String son;
        private String Daughter;
        private int family_count;
        private Family family_sub;

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public String getDaughter() {
        return Daughter;
    }

    public void setDaughter(String daughter) {
        Daughter = daughter;
    }

    public int getFamily_count() {
        return family_count;
    }

    public void setFamily_count(int family_count) {
        this.family_count = family_count;
    }

    public Family getFamily_sub() {
        return family_sub;
    }

    public void setFamily_sub(Family family_sub) {
        this.family_sub = family_sub;
    }

    public static void main(String[] args) {
        Children first_childern = new Children();

        //using Family.java class

        Family f1 = new Family();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter father name : ");
        String father_name = in.nextLine();
        f1.father = father_name;

        System.out.print("Enter mother name : ");
        String mother_name  = in.next();
        f1.mother = mother_name;


        //using children.java class

        System.out.print("Enter son name : ");
        String son_name = in.next();
        first_childern.setSon(son_name);

        System.out.print("Enter daughter name : ");
        String daughter_name = in.next();
        first_childern.setDaughter(daughter_name);

        //using Family.java class

        System.out.print("Enter husband name : ");
        String husband_name = in.next();
        f1.setHusband(husband_name);

        System.out.print("Enter wife name : ");
        String wife_name = in.next();
        f1.setWife(wife_name);

        //using children.java class
        System.out.print("Enter the count of family members : ");
        int family_count = in.nextInt();
        first_childern.setFamily_count(family_count);

        first_childern.setFamily_sub(f1);

        System.out.println("Father name is : " + first_childern.getFamily_sub().father);
        System.out.println("Mother name is : " + first_childern.getFamily_sub().mother);
        System.out.println("Son name is : " + first_childern.getSon());
        System.out.println("Daughter name is : " + first_childern.getDaughter());
        System.out.println("Husband name is : " + first_childern.getFamily_sub().getHusband());
        System.out.println("Wife name is : " + first_childern.getFamily_sub().getWife());
        System.out.println("family members count is : " + first_childern.getFamily_count());
    }
}
