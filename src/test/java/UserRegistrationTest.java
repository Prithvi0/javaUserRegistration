import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    // TEST CASES FOR VALIDATING THE FIRST NAME
    @Test
    public void givenFirstName_WhenCorrect_ShouldReturnTrue() {
        boolean result = UserRegistration.validateFirstName("Prithvi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserRegistration.validateFirstName("prithvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenAllUpperCase_ShouldReturnFalse() {
        boolean result = UserRegistration.validateFirstName("PRITHVI");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenIncludesNumeric_ShouldReturnFalse() {
        boolean result = UserRegistration.validateFirstName("pR1thvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenMinimum3Characters_ShouldReturnTrue() {
        boolean result = UserRegistration.validateFirstName("Pri");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenIncludesSpecialCharacter_ShouldReturnFalse() {
        boolean result = UserRegistration.validateFirstName("Pr@");
        Assert.assertFalse(result);
    }
    // TEST CASES FOR VALIDATING THE LAST NAME
    @Test
    public void givenLastName_WhenCorrect_ShouldReturnTrue() {
        boolean result = UserRegistration.validateLastName("Prithvi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserRegistration.validateLastName("prithvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenAllUpperCase_ShouldReturnFalse() {
        boolean result = UserRegistration.validateLastName("PRITHVI");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenIncludesNumeric_ShouldReturnFalse() {
        boolean result = UserRegistration.validateLastName("pR1thvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenMinimum3Characters_ShouldReturnTrue() {
        boolean result = UserRegistration.validateLastName("Pri");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenIncludesSpecialCharacter_ShouldReturnFalse() {
        boolean result = UserRegistration.validateLastName("Pr@");
        Assert.assertFalse(result);
    }
    // TEST CASES FOR VALIDATING THE E-MAILS
    @Test
    public void givenEmail_WhenCorrect_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNoDomain_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc@.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenNoDomainExtension_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc@gmail");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenIncludesAtLeast1LetterAndHasDomain_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("a@go.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenIncludesSpecialSymbol_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("a-@go.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenIncludesUpperCase_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("A@go.co");
        Assert.assertTrue(result);
    }
    // TEST CASES FOR VALIDATING THE MOBILE NUMBER
    @Test
    public void givenMobileNumber_WhenCorrect_ShouldReturnTrue() {
        boolean result = UserRegistration.validateMobileNumber("+919874561230");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenStartsWithCountryCodeFollowedBy10DigitCorrectMobileNumberWithNoSpaces_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("91987653210");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenStartsWithPlusFollowedByCountryCodeAndSpaceWith10DigitCorrectMobileNumber_ShouldReturnTrue() {
        boolean result = UserRegistration.validateMobileNumber("+91 9876543210");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenStartsWithCountyCodeAndSpaceWith10DigitCorrectMobileNumber_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("91 9876543210");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenStartsWithZeroFollowedBy10DigitCorrectMobileNumber_ShouldReturnTrue() {
        boolean result = UserRegistration.validateMobileNumber("09876543210");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenStartsWithZeroWithSpaceFollowedBy10DigitCorrectMobileNumber_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("0 9876543210");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenContains10DigitCorrectMobileNumber_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("9876543210");
        Assert.assertFalse(result);
    }
    // TEST CASES FOR VALIDATING THE PRE-DEFINED PASSWORD RULE1 - MINIMUM 8 CHARACTERS
    @Test
    public void givenPassword_WhenEmpty_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePasswordLength("");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenLessThan8Characters_ShouldReturnFalse() {
        boolean result= UserRegistration.validatePasswordLength("AsdfAsd");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenCorrect_ShouldReturnTrue() {
        boolean result = UserRegistration.validatePasswordLength("asdf@sdf");
        Assert.assertTrue(result);
    }
    // TEST CASES FOR VALIDATING THE PRE-DEFINED PASSWORD RULE2 - AT LEAST 1 UPPERCASE IN PASSWORD
    @Test
    public void givenPassword_WhenAtLeast1UpperCase_ShouldReturnTrue() {
        boolean result = UserRegistration.validatePasswordOfAtLeast1UpperCase("as1fAsdf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePasswordOfAtLeast1UpperCase("a1dfasdf");
        Assert.assertFalse(result);
    }
    //  TEST CASES FOR VALIDATING THE PRE-DEFINED PASSWORD RULE3 - AT LEAST 1 NUMERIC IN PASSWORD
    @Test
    public void givenPassword_WhenAtLeast1Numeric_ShouldReturnTrue() {
        boolean result = UserRegistration.validatePasswordOfAtLeast1NumericInPassword("asdf1asd");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePasswordOfAtLeast1NumericInPassword("asdfAsdf");
        Assert.assertFalse(result);
    }
    //  TEST CASES FOR VALIDATING THE PRE-DEFINED PASSWORD RULE - EXACT 1 SPECIAL CHARACTER IN PASSWORD
    @Test
    public void givenPassword_WhenExact1SpecialCharacter_ShouldReturnTrue() {
        boolean result = UserRegistration.validatePasswordOfExact1SpecialCharacterInPassword("asdf@sdf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePasswordOfExact1SpecialCharacterInPassword("asdfasdf");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMoreThan1SpecialCharacter_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePasswordOfExact1SpecialCharacterInPassword("asdf@S&f");
        Assert.assertFalse(result);
    }
    // TEST CASES FOR VALID E-MAILS
    @Test
    public void givenEmails_WhenCorrectShouldReturnTrue() {
        String[] validEmails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        int emails=0;
        while (emails<validEmails.length) {
            boolean result = UserRegistration.validateEmail(validEmails[emails]);
            Assert.assertTrue(result);
            emails++;
        }
    }
    // TEST CASES FOR INVALID E-MAILS
    @Test
    public void givenEmails_WhenInCorrect_ShouldReturnFalse() {
        String[] validEmails = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
                                "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
                                "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        int emails=0;
        while (emails < validEmails.length) {
            boolean result = UserRegistration.validateEmail(validEmails[emails]);
            Assert.assertFalse(result);
            emails++;
        }
    }
}