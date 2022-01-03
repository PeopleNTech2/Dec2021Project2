package exceptions;

public class Math {
    public static void main(String[] args) {

        //division by 0 is a runtime exception

        int num = 10;
        int total;

        System.out.println("line 1");

        System.out.println("line 2");

        //way 1: try and catch block (the ideal way to handle  exception)
        //way 2: throws keyword
        try{
            total = num / 0; //is occurring in runtime, we call this runtime exception
            System.out.println("line 3, result is: "+total);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("line 3, result is: error occurred");
        }

        System.out.println("line 4");

        //compile time exception

    }
}
