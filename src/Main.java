//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;
        do {
            String player1Move;
            String player2Move;
            boolean done = false;
            do {
                System.out.println("Player 1 please input your move: R, P, or S");
                player1Move = in.nextLine();
                if (player1Move.equalsIgnoreCase("R")) {
                    done = true;
                } else if (player1Move.equalsIgnoreCase("P")) {
                    done = true;
                } else if (player1Move.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("Invalid move. Please input a valid move.");
                    done = false;
                }
            } while (!done);
            done = false;
            do {
                System.out.println("Player 2 please input your move: R, P, or S");
                player2Move = in.nextLine();
                if (player2Move.equalsIgnoreCase("R")) {
                    done = true;
                } else if (player2Move.equalsIgnoreCase("P")) {
                    done = true;
                } else if (player2Move.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("Invalid move. Please input a valid move.");
                    done = false;
                }
            } while (!done);
            done = false;
            do {
                if (player1Move.equalsIgnoreCase("R") && player2Move.equalsIgnoreCase("R")) {
                    System.out.println("Draw!");
                    done = true;
                } else if (player1Move.equalsIgnoreCase("P") && player2Move.equalsIgnoreCase("R")) {
                    System.out.println("Player 1 Wins!");
                    done = true;
                } else if (player1Move.equalsIgnoreCase("S") && player2Move.equalsIgnoreCase("R")) {
                    System.out.println("Player 2 Wins!");
                    done = true;
                } else if (player1Move.equalsIgnoreCase("R") && player2Move.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 Wins!");
                    done = true;
                } else if (player1Move.equalsIgnoreCase("P") && player2Move.equalsIgnoreCase("P")) {
                    System.out.println("Draw!");
                    done = true;
                } else if (player1Move.equalsIgnoreCase("S") && player2Move.equalsIgnoreCase("P")) {
                    System.out.println("Player 1 Wins!");
                    done = true;
                } else if (player1Move.equalsIgnoreCase("R") && player2Move.equalsIgnoreCase("S")) {
                    System.out.println("Player 1 Wins!");
                    done = true;
                } else if (player1Move.equalsIgnoreCase("P") && player2Move.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 Wins!");
                    done = true;
                } else {
                    System.out.println("Draw!");
                    done = true;
                }
                System.out.println("Do you wish to play again? Y or N.");
                playAgain = in.nextLine();
            }while (!true);
                done = false;
        }while (playAgain.equalsIgnoreCase("Y"));
        in.close();
    }
    }