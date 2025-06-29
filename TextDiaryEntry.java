// TextDiaryEntry.java (fixed)
import java.time.LocalDate;

public class TextDiaryEntry extends AbstractDiaryEntry<String> {
    private final String content;

    protected TextDiaryEntry(LocalDate date, String content) {
        super(date);
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getEntryType() {
        return "text";
    }

    @Override
    public String toString() {
     //  return String.format(" Text Entry: %s ", getContent(),getDate()) ;
      return String.format("[%s] Text Entry: %s", getDate(), getContent());
   }
}