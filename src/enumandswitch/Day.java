package enumandswitch;

public class Day {

    public void whichDay(Week Week){
        switch (Week){
            case MONDAY:
                System.out.println("first day of the week");
                break;
            case TUESDAY:
                System.out.println("second day of the week");
                break;
            case WEDNESDAY:
                System.out.println("third day of the week");
                break;
            case THURSDAY:
                System.out.println("fourth day of the week");
                break;
            case FRIDAY:
                System.out.println("fifth day of the week");
                break;
            case SATURDAY:
                System.out.println("sixth day of the week");
                break;
            case SUNDAY:
                System.out.println("seventh day of the week");
                break;
//            default:
//                System.out.println("please enter the right code");
//                break;
        }
    }

}
