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

    public Goal(LocalDate dateOfAchieveing, String subject, int bonus) {
        this.dateOfAchieveing = dateOfAchieveing;
        this.subject = this.subject;
        this.bonus = bonus;
    }
}
