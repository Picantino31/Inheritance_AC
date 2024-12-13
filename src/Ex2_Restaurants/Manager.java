package Ex2_Restaurants;
public class Manager extends Employee {

    private int salary;

    public Manager( String n, int s, String sin){
        super(n, sin);
        salary = s;

    }

    public double getPay(){
        double monthyPay = salary/12;
        double tax = monthyPay * 0.12;
        taxesCollected += tax;
        return monthyPay - tax;
    }


}
