package nestedclass;

public class TestNestedClass {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        outerClass.outerMethodA();
        outerClass.outerMethodB();

        outerClass.innerA.innerMethodA();

        outerClass.innerB.innerMethodB();
    }
}
