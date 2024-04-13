import java.util.Calendar;
import java.util.Date;



public class Employee {
    protected String name;
    protected String lastName;
    protected String address;
    protected String email;
    protected String pesel;
    protected int hireYear;
    protected int baseSalary = 3000;


    public Employee(String name, String lastName, String address, String email, String pesel, int hireYear) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.hireYear = hireYear;
    }
    public double calculateSalary (){
        double salary;
        int currentYear = java.time.Year.now().getValue();
        salary = baseSalary + 1000*(currentYear-hireYear);
    return salary;}
}
