package Ex2_Restaurants;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Ex2_Main {
    public static void run(){

        ArrayList<Employee> allEmp = new ArrayList<>();

//        Employee a = new Employee();
//        System.out.println(a.getName());

        allEmp.add(new Manager("Suzie", 49000, "555 555 556"));
        allEmp.add(new Manager("Gurdeep", 24000, "777 777 771")   );


        for (int i = 0; i < allEmp.size(); i++) {

            System.out.println( "This months pay for " + allEmp.get(i).getName() + " is $" + allEmp.get(i).getPay()  );


        }


    }


}
