package FamilyTree;

import java.util.ArrayList;

public class Person {
    public String name;
    public String country;
    public ArrayList<Person> children;


   // public Person[] allChildren;

    public Person(String n, String c){
        name = n;
        country = c;
        children = new ArrayList<>();
        // allChildren = new Person[4];

    }

    public void addChild(Person p){
        children.add(p);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
