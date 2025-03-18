package FamilyTree;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyTreeMain {
    public static Scanner input = new Scanner(System.in);

    public static void run() {
//ArrayList<Person> wholeFamily

//        Generation 0
        Person person1 = new Person("Bobbie", "Mexico");

//      Generation 1
        person1.addChild(new Person("Susan", "Canada"));
        person1.addChild(new Person("Jill", "Canada"));
        person1.addChild(new Person("Bobette", "Czechia"));

        //Generation 2

//        Susan
        person1.children.get(0).addChild(new Person("Zain", "Czechia"));

//        Jill
        person1.children.get(1).addChild(new Person("Aaron Cheng", "Canada"));
        person1.children.get(1).addChild(new Person("Yoshi", "Japan"));


//        Bobette
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));

//        Generation 3

//        SUSAN Zain
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));

//        Jill Yoshi
        person1.children.get(1).children.get(1).addChild(new Person("Mario", "Italy"));
        person1.children.get(1).children.get(1).addChild(new Person("Luigi", "Italy"));


//      BOBETTE  Bob III
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));

//        Jasmine
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

//        Generation 4

//        Mario
        person1.children.get(1).children.get(1).children.get(0).addChild(new Person("Mario Jr", "Japan"));


        while (true) {
            System.out.println("\nPress 1 to print the family\nPress 2 to count the number of family members\nPress 3 to print Canadians\nPress 4 to print from here\nPress 5 to exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                //print fam
                printFamily(person1);
            }
            if (choice == 2) {
                //count family
                System.out.println("The number of people in " + person1.name + "'s family is:  " + countFamily(person1));
            }
            if (choice == 3) {
                //print canadians
                System.out.println("CANADIANS ONLY: ");
                printCanadians(person1);

            }
            if (choice == 4) {
                //print from here
                System.out.println("Who do you want to start from");
                String ans = input.nextLine();
                StartFromHere(person1, ans);
            }
            if (choice == 5) {
                return;
            }

        }//while


    }







    public static void printFamily(Person ptemp){
        for (int i = 0; i < ptemp.children.size(); i++) {
            System.out.println(ptemp.children.get(i).getName());
            printFamily(ptemp.children.get(i));
        }

    }

    public static int countFamily(Person ptemp){
        //counts the number of people
        int num = 0;

        num++;

        for (int i = 0; i <ptemp.children.size() ; i++) {
            num += countFamily(ptemp.children.get(i));
        }


        return num;
    }

    public static void printCanadians(Person ptemp){

        for (int i = 0; i < ptemp.children.size(); i++) {
            if(ptemp.children.get(i).getCountry().equals("Canada")) {
                System.out.println(ptemp.children.get(i).getName());
            }
            printCanadians(ptemp.children.get(i));
        }


    }

    public static void StartFromHere(Person pTemp, String start){
        for (int i = 0; i < pTemp.children.size(); i++) {
            if(pTemp.children.get(i).name.equalsIgnoreCase(start)){
                printFamily(pTemp.children.get(i));
            }
            StartFromHere(pTemp.children.get(i), start);
        }




    }



} //Main Class
