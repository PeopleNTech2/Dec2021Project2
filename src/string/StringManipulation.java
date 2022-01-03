package string;

public class StringManipulation {
    public static void main(String[] args) {

        //StringBuffer class & StringManipulation class
        StringBuffer buffer=new StringBuffer("hello");
        buffer.append(" java");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("hello");
        //builder.append("java");
        builder.reverse();
        builder.append(" java");
        System.out.println(builder);

    }
}
