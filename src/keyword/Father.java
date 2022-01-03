package keyword;

public class Father {//super class

    int height = 10;
    int numberOfSports = 5;

    public Father(){

    }

    public Father(int height){
        this.height = height;
        System.out.println(height);
    }

    public void education(){
        System.out.println("educated");
    }

}
