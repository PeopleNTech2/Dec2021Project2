package shufflegame;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    /*
    if/loop/method(recursive)/array

    guess where the 0 is ?
    are you ready to play? y/n

    if y:
    shuffle the game
    pick 1, 2 or 3!
            if good guess:
    good guess!
            if not good guess:
    sorry!!! wrong guess

    do you want to try again? y/n
    if answer is not y/n keep asking the question

    if y:
    loop the game
    if n:
    see you next time!
    */
    Scanner sc = new Scanner(System.in);

    public int[] shuffleGame(int[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }

    public int playerGuess(){
        int guess = 0;
        System.out.println("pick 1, 2 or 3!");
        do{
            guess = sc.nextInt();
        }while (guess != 1 && guess != 2 && guess != 3);
        return guess-1;
    }

    public void checkGuess(int[] array, int guess){
        if(array[guess] == 0) {
            System.out.println("array result "+array[guess]);
            System.out.println("guess is: "+guess);

            System.out.println("Good guess");
        }else {
            System.out.println("Sorry!!! Wrong guess");
        }
    }

    int [] array = {1,0,1};

    public void play(){
        char answer = sc.next().charAt(0);

        //y/Y or n/N
        while (Character.toLowerCase(answer) != 'y' && Character.toLowerCase(answer) != 'n'){
            System.out.println("please enter 'y' or 'n'");
            answer = sc.next().charAt(0);
            if(Character.toLowerCase(answer) == 'y' || Character.toLowerCase(answer) == 'n'){
                break;
            }
        }

        if (Character.toLowerCase(answer) == 'y'){
            int[] array2 = shuffleGame(array);
            checkGuess(array2, playerGuess());
            System.out.println("do you want to play again ?");
            play(); // recursive method
        }else{
            System.out.println("see you next time!");
        }


    }

}
