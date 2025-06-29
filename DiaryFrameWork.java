import java.time.LocalDate;
import java.util.List;

public class DiaryFrameWork {
    public static void main(String[] args) {
        Diary<DiaryEntry<?>> diary = new Diary<>();
        TextDiaryEntry tde = new TextDiaryEntry(LocalDate.now(), "Today was a productive day, completed my Java assignment!");
        diary.addEntry(tde);
        MoodDiaryEntry mde= new MoodDiaryEntry(LocalDate.now(),5);
        diary.addEntry(mde);
        ActivityDiaryEntry ade= new ActivityDiaryEntry(LocalDate.now(), List.of("Hiking", "Picnic", "Reading"));
        diary.addEntry(ade);
        System.out.println("-----------------------");
        diary.addEntry(new TextDiaryEntry(LocalDate.now().minusDays(1), "Feeling a bit tired today"));
        diary.addEntry(new MoodDiaryEntry(LocalDate.now().minusDays(1), 2));
        diary.addEntry(new ActivityDiaryEntry(LocalDate.now().minusDays(1),
                List.of("Work", "Gym", "TV")));

        System.out.println("Diary Entries:" );
        System.out.println("=== All Entries ===");
        diary.getAllEntries().forEach(System.out::println);



        System.out.println("\n=== Sorted By Mood ===");
        diary.sortByMood();
        diary.getAllEntries().forEach(System.out::println);

        System.out.println("\n=== Sorted By Date ===");
        diary.sortByDate();
        diary.getAllEntries().forEach(System.out::println);


    }



        }


