import java.time.LocalDate;
import java.util.List;

public class P_8_1_1 {
    static void main() {
        var days = List.of(LocalDate.of(2021,9,14),
                            LocalDate.of(2021,3,15));
        IO.println(days.get(1));
    }
}
