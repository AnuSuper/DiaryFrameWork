import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Diary <T extends DiaryEntry<?>> {
    final List<T> entries = new ArrayList<>();

    public void addEntry(T entry) {
        entries.add(entry);

    }

    public List<T> getEntriesByDate(LocalDate date) {
        List<T> entriesbydate = new ArrayList<>();
        for (T entry : entries) {
            if (entry.getDate().equals(date)) {
                entriesbydate.add(entry);
            }
        }
        return entriesbydate;
    }

    public List<T> searchEntries(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T entry : entries) {
            if (predicate.test(entry)) {
                result.add(entry);
            }
        }
        return result;
    }

    public void deleteEntry(T entry) {
        entries.remove(entry);
    }

    public List<T> getAllEntries() {
        return new ArrayList<>(entries);
    }

    public void sortByDate() {
        entries.sort(Comparator.comparing(DiaryEntry::getDate));
    }






    public void sortByMood() {
        entries.sort(Comparator.comparingInt(e -> {
            if (e instanceof MoodDiaryEntry moodEntry) {
                return moodEntry.getContent();
            }
            return Integer.MAX_VALUE;
        }));


    }
}



