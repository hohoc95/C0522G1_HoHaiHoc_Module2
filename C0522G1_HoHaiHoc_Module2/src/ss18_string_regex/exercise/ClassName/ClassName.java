package ss18_string_regex.exercise.ClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[C|A|P][0-9]{4}[GHIKLM]";

    public ClassName(){
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate (String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
