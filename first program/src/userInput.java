import java.util.*;
public class userInput {

    public static void main(String[] args) {
        int C;
        int F;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter C");
        C = input.nextInt();
        F = 9*C/5 +32;
        System.out.println(F);


    }
}