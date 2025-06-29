import java.time.LocalDate;

public class MoodDiaryEntry extends AbstractDiaryEntry<Integer> {
    private final Integer moodRating;

    // Changed protected to public for better accessibility
    public MoodDiaryEntry(LocalDate date, Integer moodRating) {
        super(date); // Properly passes date to superclass
        if (moodRating == null || moodRating < 1 || moodRating > 5) {
            throw new IllegalArgumentException("Mood rating must be between 1 and 5 (was: " + moodRating + ")");
        }
        this.moodRating = moodRating;
    }

    @Override
    public Integer getContent() {
        return moodRating;
    }

    @Override
    public String getEntryType() {
        return "mood";
    }

    @Override
    public String toString() {

        return String.format("[%s] Mood Rating: %d/5",
                getDate() != null ? getDate().toString() : "null",
                moodRating);
    }
}
