package mirea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cardsPerPlayer = 5;
        int players =0 ;

        String[] suits = {
                "Spades", "Diamonds", "Hearts", "Clubs"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int n = 52;

        for(;;){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of players: ");

            if(input.hasNextInt()){

                players = input.nextInt();
                if(cardsPerPlayer * players <= n){
                    break;
                } else {
                    if (players ==0){

                        System.out.println("Game was stopped");
                        break;

                    } else if (players<0){

                        System.out.println("Not enough players");

                    } else{

                        System.out.println("Too many players");
                    }
                }

            } else{
                System.out.println("Error!");

            }
        }

        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " of " + suits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }
    }

}
