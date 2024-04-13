import java.util.ArrayList;

public class Tester extends Employee{
    public ArrayList<String> tests = new ArrayList<String>();
    public Tester(String name, String lastName, String address, String email,
                  String pesel, int hireYear) {
        super(name, lastName, address, email, pesel, hireYear);
    }
    public void addTestType(String nameOfTest){
        if (tests.contains(nameOfTest)){
            throw new IllegalArgumentException("Test dodany już do listy.");
        }
        tests.add(nameOfTest);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        salary+=300*tests.size();
    return salary;}
}
