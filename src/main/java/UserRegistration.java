import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateFirstName(String FirstName){
        Pattern firstNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");   // PATTERN FOR FIRST LETTER IN CAPITAL AND MINIMUM OF 3 CHARACTERS LENGTH
        Matcher firstNameMatcher = firstNamePattern.matcher(FirstName);
        return firstNameMatcher.matches();
    }
}
