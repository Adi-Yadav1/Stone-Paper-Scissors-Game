import java.util.Scanner;
import java.util.Random;

public class code {
    public static void main(String[] args) {
        // Create an instance of Random class
        int i = 0;
        do{
        Random random = new Random(); 

        // Generate a random integer between 1 (inclusive) and 3 (inclusive)
        int randomInt = random.nextInt(3) + 1;
        // System.out.println("Random Integer (1, 2, or 3): " + randomInt);
        System.out.println("Make your move:");
        System.out.println("Press 1 for Stone");
        System.out.println("Press 2 for Paper");
        System.out.println("Press 3 for Scissor");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
            if (number == randomInt){
                System.out.println("Match Draw");
            }
            else if (randomInt ==2){
                System.out.println("You Lose!, Computer Win");
            }
            else if (randomInt == 3 ){
                System.out.println("You Won, Computer Lose");
            }
            else{
                System.out.println("Enter only 1,2,3");
            }
            break;

            case 2:
            if (number == randomInt){
                System.out.println("Match Draw");
            }
            else if (randomInt ==3){
                System.out.println("You Lose!, Computer Win");
            }
            else if (randomInt == 1){
                System.out.println("You Won, Computer Lose");
            }
            else{
                System.out.println("Enter only 1,2,3");
            }
                break;
            case 3:
            if (number == randomInt){
                System.out.println("Match Draw");
            }
            else if (randomInt ==1){
                System.out.println("You Lose!, Computer Win");
            }
            else if (randomInt == 2){
                System.out.println("You Won, Computer Lose");
            }
            else{
                System.out.println("Enter only 1,2,3");
            }
                break;

            default:
            System.out.println("Follow the Rule of the game ");
                break;
        }
        System.out.println("Computer Selected: " + randomInt);
        i++;
    }while(i<5);

}

}
