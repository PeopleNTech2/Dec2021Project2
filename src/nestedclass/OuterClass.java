package nestedclass;

//outer class
public class OuterClass {
    private int outerNum = 10;

    InnerA innerA = new InnerA();
    InnerB innerB = new InnerB();

    //outer class default constructor
    public OuterClass(){

    }

    public void outerMethodA(){
        System.out.println("outer method A");
    }

    public void outerMethodB(){
        System.out.println("outer method B");
        innerA.innerMethodA();
        innerB.innerMethodB();
    }

    //inner class A (nested class)
    public class InnerA {
        int innerNumA = 15;
        //Inner class A default constructor
        public InnerA(){

        }
        public void innerMethodA(){
            System.out.println("inner A method");
        }
    }//end of the inner class A

    //inner class B (nested class)
    public class InnerB {
        int innerNumB = 20;
        //Inner class A default constructor
        public InnerB(){
            System.out.println("inner B method");
        }
        public void innerMethodB(){

        }
    }//end of the inner class B

}//end of the outer class
