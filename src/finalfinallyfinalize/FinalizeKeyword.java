package finalfinallyfinalize;

public class FinalizeKeyword {

    //finalize is a keyword used in garbage collection
    int a = 1;

    public void printNumber(){
        System.out.println("number is: "+a);
    }

    public void finalize(){
        System.out.println("object garbage is collected");
    }

    public static void main(String[] args) {

        FinalizeKeyword gc = new FinalizeKeyword();

        gc.printNumber();

        gc = null;

        System.gc();
    }
}
