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
        Pattern emailPattern = Pattern.compile("^[a-zA-Z]+([+-_.][a-zA-Z0-9])*[0-9]*\\@[a-z0-9]+[.]([a-z]{2,4}[.])?[a-z]{2,4}$");
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
    public static boolean validatePasswordLength(String password) {
        Pattern passwordPatternLength = Pattern.compile("^.{8,}$");   //  PATTERN FOR MINIMUM OF 8 CHARACTER PASSWORD
        Matcher passwordPatternMatcher = passwordPatternLength.matcher(password);
        return passwordPatternMatcher.matches();
    }
    public static boolean validatePasswordOfAtLeast1UpperCase(String password) {
        Pattern passwordOfAtLeast1UpperCase = Pattern.compile(".*[A-Z]+.*");    // PATTERN FOR AT LEAST 1 UPPERCASE IN PASSWORD
        Matcher passwordOfAtLeast1UpperCaseMatcher = passwordOfAtLeast1UpperCase.matcher(password);
        return passwordOfAtLeast1UpperCaseMatcher.matches();
    }
    public static boolean validatePasswordOfAtLeast1NumericInPassword(String password) {
        Pattern passwordOfAtLeast1Numeric = Pattern.compile(".*[0-9]+.*");  // PATTERN FOR AT LEAST 1 NUMERIC IN PASSWORD
        Matcher passwordOfAtLeast1NumericMatcher = passwordOfAtLeast1Numeric.matcher(password);
        return passwordOfAtLeast1NumericMatcher.matches();
    }
    public static boolean validatePasswordOfExact1SpecialCharacterInPassword(String password) {
        // PATTERN FOR EXACTLY 1 SPECIAL CHARACTER IN PASSWORD
        Pattern passwordOfExact1SpecialCharacter = Pattern.compile("^[^$&+,:;=?`~\"@#|'<>.^*()%!_-]*[$&+,:;=?`~\"@#|'<>.^*()%!_-][^$&+,:;=?`~\"@#|'<>.^*()%!_-]*$");
        Matcher passwordOfExact1SpecialCharacterMatcher = passwordOfExact1SpecialCharacter.matcher(password);
        return passwordOfExact1SpecialCharacterMatcher.matches();
    }

    //  METHOD FOR VALIDATING ALL PASSWORD TEST CASES
    public static boolean passwordValidation(String password) {
        boolean passwordLength = validatePasswordLength(password);
        if (passwordLength && validatePasswordOfAtLeast1UpperCase(password) && validatePasswordOfAtLeast1NumericInPassword(password) && validatePasswordOfExact1SpecialCharacterInPassword(password)) //{
            return true;
        return false;
    }
}