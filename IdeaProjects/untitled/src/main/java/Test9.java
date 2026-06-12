import java.util.Arrays;

public class Test9 {
    static void main() {
        record Test(int[] ary, int n){}
        int a[] = {1,2,3};
        Test b = new Test(a, 10);
        IO.println(Arrays.toString(b.ary()));
        IO.println(b.n());
        a[1] = 9;
        IO.println(Arrays.toString(b.ary()));
    }
}
