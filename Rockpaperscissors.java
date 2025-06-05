
import java.util.*;

class Rockpaperscissors {

    public static void main(String[] args) {
        String[] rps = {"Rock", "Paper", "Scissors"};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Enter your Move");
            String userMove = sc.nextLine();
            if (userMove.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing");
                break;
            }
            if (!userMove.equalsIgnoreCase("Rock")
                    && !userMove.equalsIgnoreCase("Paper")
                    && !userMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid Move");
                continue;
            }
            int randIndex = random.nextInt(3);
            String computerMove = rps[randIndex];
            System.out.println("computer played " + computerMove);
            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's draw");
            } else if ((userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors"))
                    || (userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock"))
                    || (userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
                System.out.println("You Win!!!");
            } else {
                System.out.println("You lose!! Try again");
            }
        }
    }
}
