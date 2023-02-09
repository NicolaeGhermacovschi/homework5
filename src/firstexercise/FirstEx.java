package firstexercise;

import java.util.Scanner;

public class FirstEx {
    public FirstEx() {
    }

    public void method(){
        Scanner sc = new Scanner(System.in);
        int nr;
        int sumPoz = 0, sumNeg = 0, countPoz = 0, countNeg = 0;

        do {

            System.out.print("Enter number <> 0 : ");
            nr = sc.nextInt();
            if (nr > 0 ){
                sumPoz += nr;
                countPoz++;

            } else if (nr < 0) {
                sumNeg += nr;
                countNeg++;
            } else if(nr == 0) {
                System.out.println("STOP");
            } else  {
                System.out.println("ERROR");
            }
        }
        while (nr != 0 );
        System.out.println(countPoz + " positive numbers with a sum of " + sumPoz + " have been entered");
        System.out.println(countNeg + " negative numbers with a sum of " + sumNeg + " have been entered");




        sc.close();
    }




}
