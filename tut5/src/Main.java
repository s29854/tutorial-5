import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(java.time.Year.now().getValue());
        ArrayList<Employee> employees = new ArrayList<>();

        Developer dev1 = new Developer("Adam", "Nowak", "Warszawa",
                "adamnowak@kopmputerex.pl", "90281900", 2018);
        employees.add(dev1);

        Technology t1 = new Technology("Java", 1000);
        Technology t2 = new Technology("HTML", 300);
        Technology t3 = new Technology("Python", 1200);
        Technology t4 = new Technology("AI", 5000);
        dev1.addTechnology(t1);
        //dev1.addTechnology(t4);

        /*Developer dev2 = new Developer("Andrzej", "Kowalski", "Bydgoszcz",
                "akowalski@komputerex.pl", "01365192", 2020);
        dev2.addTechnology(t1);
        dev2.addTechnology(t2);
        dev2.addTechnology(t3);
        employees.add(dev2);

        Developer dev3 = new Developer("Anna", "Nowak", "Bydgoszcz",
                "annanowak@komputerex.pl", "01386432", 2017);
        dev3.addTechnology(t3);
        dev3.addTechnology(t4);
        employees.add(dev3);*/

        Tester tester1 =new Tester("Zuzanna", "Jhonson", "Kraków",
                "zj@komputerex.pl", "007820039", 2022);
        tester1.addTestType("UI/UX");
        employees.add(tester1);

        Manager manager = new Manager("Leon", "Piela", "Warszawa",
                "lp@komputerex.pl", "033714091", 2024);
        Goal goal1 = new Goal(LocalDate.of(2024, 4, 30),"Implementing login", 1000);
        manager.addGoal(goal1);
        employees.add(manager);

        double totalAmount = 0;
        for (Employee employee : employees){
            totalAmount += employee.calculateSalary();
        }
        System.out.println(totalAmount);
    }
}