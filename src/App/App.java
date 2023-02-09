package App;

import firstexercise.FirstEx;
import secondexrcise.SecondEx;
import thirdexercise.ThirdEx;

public class App {
    public static void main(String[] args) {

        System.out.println("========= EX1 =========");
        FirstEx exF = new FirstEx();
        exF.method();
        System.out.println("========= EX2 =========");
        SecondEx exS = new SecondEx();
        exS.method();
        System.out.println("========= EX3 =========");
        ThirdEx exT = new ThirdEx();
        exT.method();


    }
}