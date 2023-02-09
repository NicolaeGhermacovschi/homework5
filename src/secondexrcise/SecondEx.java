package secondexrcise;

public class SecondEx {

    public SecondEx() {
    }

    public void method(){
        int count = 0;
        for(int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {

                System.out.print(i + " ");
                count++;
                if (count % 10 == 0){
                    System.out.print("\n");
                }
            }
        }
    }

}
