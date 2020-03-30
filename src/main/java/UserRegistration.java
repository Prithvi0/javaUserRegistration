import javax.swing.plaf.PanelUI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //  METHOD FOR VALIDATING FIRST NAME
    public static boolean validateFirstName(String firstName) {
        // PATTERN FOR FIRST NAME, FIRST LETTER IN CAPITAL AND MINIMUM OF 3 CHARACTERS LENGTH
        Pattern firstNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher firstNameMatcher = firstNamePattern.matcher(firstName);
        return firstNameMatcher.matches();
    }
    //  METHOD FOR VALIDATING LAST NAME
    public static boolean validateLastName(String lastName) {
        // PATTERN FOR LAST NAME, FIRST LETTER IN CAPITAL AND MINIMUM OF 3 CHARACTERS LENGTH
        Pattern lastNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher lastNameMatcher = lastNamePattern.matcher(lastName);
        return lastNameMatcher.matches();
    }
    //  METHOD FOR VALIDATING E-MAIL
    public static boolean validateEmail(String email) {
        //  PATTERN FOR A VALID E-MAIL, MUST CONTAIN AT LEAST A LETTER FOLLOWED BY '@' SYMBOL AND A DOMAIN AND REMAINING ARE OPTIONAL
        Pattern emailPattern = Pattern.compile("^[a-zA-Z]+[+-_.]?[a-zA-Z0-9]*\\@[a-z]{2,}\\.([a-z]{2,4}\\.)?[a-z]{2,4}$");
        Matcher emailMatcher = emailPattern.matcher(email);
        return emailMatcher.matches();
    }
    //  METHOD FOR VALIDATING MOBILE NUMBER
    public static boolean validateMobileNumber(String mobileNumber) {
        //  PATTERN FOR A VALID MOBILE NUMBER, MAY OR MAY NOT CONTAIN A COUNTRY CODE FOLLOWED BY A 10-DIGIT MOBILE NUMBER
        Pattern mobileNumberPattern = Pattern.compile("(^[+]?(91|91[ ])|0)[6-9][0-9]{9}");
        Matcher mobileNumberMatcher = mobileNumberPattern.matcher(mobileNumber);
        return mobileNumberMatcher.matches();
    }
    //  METHOD FOR VALIDATING PASSWORD
    public static boolean validatePassword(String password) {
        Pattern passwordPatternLength = Pattern.compile("^.{8,}$");   //  PATTERN FOR MINIMUM OF 8 CHARACTER PASSWORD
        Matcher passwordPatternMatcher = passwordPatternLength.matcher(password);
        return passwordPatternMatcher.matches();
    }
}