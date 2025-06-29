import java.time.LocalDate;
import java.util.List;

public class ActivityDiaryEntry extends AbstractDiaryEntry<List<String>> {
    private final List<String> activities;

    public ActivityDiaryEntry(LocalDate date, List<String> activities) {
        super(date);
        if (activities == null) {
            throw new IllegalArgumentException("Activities list cannot be null");
        }
        this.activities = List.copyOf(activities);
    }

    @Override
    public List<String> getContent() {
        return activities;
    }

    @Override
    public String getEntryType() {
        return "activity";
    }

    @Override
    public String toString() {
        return String.format("[%s] Activities: %s",
                getDate(),
                String.join(", ", getContent()));
    }
}