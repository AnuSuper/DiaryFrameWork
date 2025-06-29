// DiaryEntry.java (unchanged, correct)
import java.time.LocalDate;  // Add this import statement

public interface DiaryEntry<T> {
    T getContent();
    LocalDate getDate();
    String getEntryType();
}