package keyword;

public class TestSuper {
    public static void main(String[] args) {

        Father father = new Father();
        System.out.println(father.height);
        System.out.println(father.numberOfSports);
        father.education();

        Child child = new Child();
        System.out.println(child.height);
        System.out.println(child.numberOfSports);
        child.higherEducation();
        child.athleticSkills();


    }
}
