import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final Random randomGenerator = new Random();
        for(int i=0;i<10;i++){
        int g = 1+randomGenerator.nextInt(5);
            int k = g + randomGenerator.nextInt(7);
        System.out.println(g+" "+k);
        }
    }
}