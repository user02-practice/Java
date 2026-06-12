import java.util.List;

public class Test8 {
    static void main() {
        String str = "abcdef";
        //IO.println(str);
        str = str.replace("bc","xy");
        IO.println(str);

        var members = List.of("yamamoto", "kishida", "sugiyama");

// membersから1人ずつ取り出して、変数 name に入れてループする
        for (String name : members) {
            IO.println("こんにちは、" + name + "さん");
        }

        // 0からスタートして、5未満の間、1ずつ増やしながら繰り返す（計5回）
        for (int i = 0; i < 5; i++) {
            IO.println("カウンタの値: " + i);
        }
    }


}
