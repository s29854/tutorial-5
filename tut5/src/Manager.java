import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Goal> goals = new ArrayList<Goal>();
    public Manager(String name, String lastName, String address, String email, String pesel, int hireYear) {
        super(name, lastName, address, email, pesel, hireYear);
    }
    public void addGoal(Goal goal){
        if (goals.contains(goal)){
            throw new IllegalArgumentException("Cel dodany już do listy.");
        }
        goals.add(goal);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        LocalDate currentMonth = LocalDate.now().withMonth(1);
        for (Goal goal : goals){
            if (goal.getDateOfAchieveing().withMonth(1).equals(currentMonth)){
                salary+= goal.getBonus();
            }
        }
    return salary;}
}
