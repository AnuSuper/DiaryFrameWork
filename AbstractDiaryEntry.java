// AbstractDiaryEntry.java (fixed)
import java.time.LocalDate;

public abstract class AbstractDiaryEntry<T> implements DiaryEntry<T> {
    private final LocalDate date;

    protected AbstractDiaryEntry(LocalDate date) {
        this.date = date;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public abstract String getEntryType();

    @Override
    public abstract T getContent();  // Made abstract
}