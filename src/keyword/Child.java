package keyword;

public class Child extends Father{

    //super in constructor
    public Child(){
        super(20);
    }

    //super in method
    public void higherEducation(){
        super.education();
    }

    //super in variable
    public void athleticSkills(){
        int numOfSport = super.numberOfSports;
        System.out.println(numOfSport);
    }
}
