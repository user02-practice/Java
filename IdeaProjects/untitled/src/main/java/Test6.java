public class Test6 {
    static void main() {
        //うるう年の西暦を求める
        //西暦を入力
        //int year = Integer.parseInt(IO.readln("西暦　:"));

        /**if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            IO.println("うるう年");
        } else{
            IO.println("うるう年じゃない");
        }
        **/
        int a = Integer.parseInt(IO.readln("年"));

        if (a / 5 == 5  ) {
            IO.println("5");
        }else {
            IO.println("?");


        }
    }
}



        /**うるう年の判定
        //4で割り切れてかつ100で割り切れなくてかつ400で割り切れる

        boolean flag = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        //うるう年か否かを判定
        if(flag){
            IO.println(year + "年はうるう年");
        }else  {
            IO.println(year + "年はうるう年ではありません");
        }
    }
}

**/