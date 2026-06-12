import java.time.LocalDate;
import java.util.ArrayList;

public class P_8_1_2 {
    static void main() {
        var authors = new ArrayList<String>();
        authors.add("yamamoto");
        authors.add("naoki");
        authors.add("sugiyama");
        authors.add("hosoya");
        authors.set(1, "kishida");
        IO.println(authors);


// varを使う書き方（これでも dates は自動的に ArrayList<LocalDate> 型になります）
        var dates = new ArrayList<LocalDate>();
        // 2021年9月14日の日付データを作って、リストに追加する
        dates.add(LocalDate.of(2021, 9, 14));
        IO.println(dates);



    }
}
