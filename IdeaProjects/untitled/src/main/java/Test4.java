public class Test4 {
    static void main() {
        int a = 1;
        int b = 2;
        //AND
        //IO.println(++a == 1 & ++b ==3);
        //IO.println("a=" + a + " b=" + b);

        IO.println(a++ == 2 | b++ == 3);
        IO.println("a=" + a + " b=" + b);
    }

}
