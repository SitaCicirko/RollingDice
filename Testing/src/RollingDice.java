import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(6) + 1;

        System.out.println("You rolled a: " + a);

    }


}