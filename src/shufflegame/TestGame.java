package shufflegame;

public class TestGame {
    public static void main(String[] args) {
        System.out.println("=====Welcome to shuffle game====");
        System.out.println("-----guess where the 0 is ?-----");
        System.out.println("are you ready to play? y/n");

        Game game = new Game();

        game.play();


//        int [] array = {1, 0, 1};
//        int [] array2 = game.shuffleGame(array);
//
//
//        for(int i=0; i<array2.length; i++){
//            System.out.print(array2[i]);
//        }


    }
}
