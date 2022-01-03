package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        //Pattern / Matcher
        String email = "john_now@google.guru";

        String email2 = "john@ google.guru";

        String pattern = "^[A-Za-z0-9_.-]{6,25}@[A-Za-z0-9+.-]+\\.[A-Za-z]{2,4}$";

        //create pattern object
        Pattern r = Pattern.compile(pattern);

        //create matcher object
        Matcher m = r.matcher(email);

        System.out.println(m.matches());

    }
}
