package singleton;

public class Singleton {

    //create a private object of this class
    private static Singleton singleton = new Singleton();

    //I make the constructor private to not create any object of this class
    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }

    public void doWork(){
        System.out.println("singleton class job");
    }
}
