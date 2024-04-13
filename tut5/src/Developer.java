import java.util.ArrayList;

public class Developer extends Employee{
    private ArrayList<Technology> knownTechnologies = new ArrayList<>();
    public Developer(String name, String lastName, String address, String email, String pesel, int hireYear)
    {
        super(name, lastName, address, email, pesel, hireYear);

    }
    public void addTechnology(Technology technology){
        if (knownTechnologies.contains(technology)){
            throw new IllegalArgumentException("Technologia dodana już na listę.");
        }
        knownTechnologies.add(technology);
    }
    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        for (Technology t : knownTechnologies){
            salary += t.getBonus();
        }

    return salary;}
}
