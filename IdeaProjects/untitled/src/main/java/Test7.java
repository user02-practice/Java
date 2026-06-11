public class Test7 {
    static void main() {
        //月を入力して四季を求める
        //月を入力
        int month = Integer.parseInt(IO.readln("月 "));
        //12.1.2は冬、3.4.5は春、6.7.8は夏9.10.11は秋と表示
        //それ以外が入力されたら該当なしと表示する
        /**IO.println(switch (month) {
            case 12, 1, 2 -> "冬";
            case 3, 4, 5 -> "春";
            case 6, 7, 8 -> "夏";
            case 9, 10, 11 -> "秋";
            default -> "該当なし";**/

            String str = (switch (month) {
                case 12, 1, 2 -> "冬";
                case 3, 4, 5 -> "春";
                case 6, 7, 8 -> "夏";
                case 9, 10, 11 -> "秋";
                default -> "該当なし";
        });
            IO.println(month + "月は" + str + "です");
    }
}
