import java.time.LocalDate;

public class P_8_3_3 {
    static void main() {
        record  word(String english,String japanese){}
        var w1 = new word("spring","春");
        var w2 = new word("winter","冬");

        record  Spending(LocalDate date, int price, String memo){}
        var s1 = new Spending(LocalDate.now(), 100, "今日の価格");
        var s2 = new Spending(LocalDate.of(2026,6,12),500, "2026.6.12の価格");

        IO.println(s1);
        IO.println(s2);

        record home(String address, int roomnumber){}
        var h1 = new home("umeda", 110);
        IO.println(h1);

    }
}
