package thirdexercise;
import java.math.BigDecimal;
import java.text.DecimalFormat;
public class ThirdEx {

    public ThirdEx() {
    }

    public  void method(){
        double sum = 0;
        DecimalFormat df = new DecimalFormat("#");
        for (int i = 1, j = 0; i < 99; i = i + 2) {
            j = i + 2;
             sum = sum + ( (double)i / (double) j);
            System.out.println(i + "/" + j);
            //System.out.println(String.format("%.12f", sum) );

        }
        System.out.println(String.format("%.15f", sum) );
    }

}
