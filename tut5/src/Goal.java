import java.time.LocalDate;

public class Goal {
    private LocalDate dateOfAchieveing;
    private String subject;
    private int bonus;


    public String getSubject() {
        return subject;
    }

    public LocalDate getDateOfAchieveing() {
        return dateOfAchieveing;
    }

    public int getBonus() {
        return bonus;
    }

    public Goal(int year, int month, int day, String subject, int bonus) {
        this.dateOfAchieveing = LocalDate.of(year, month, day);
        this.subject = this.subject;
        this.bonus = bonus;
    }
}
