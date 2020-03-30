import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    // TEST CASES FOR VALIDATING THE FIRST NAME
    @Test
    public void givenFirstName_WhenCorrect_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Prithvi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("prithvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenAllUpperCase_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("PRITHVI");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenIncludesNumeric_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("pR1thvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenMinimum3Characters_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Pri");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenIncludesSpecialCharacter_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Pr@");
        Assert.assertFalse(result);
    }
    // TEST CASES FOR VALIDATING THE LAST NAME
    @Test
    public void givenLastName_WhenCorrect_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Prithvi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("prithvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenAllUpperCase_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("PRITHVI");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenIncludesNumeric_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("pR1thvi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenMinimum3Characters_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Pri");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenIncludesSpecialCharacter_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Pr@");
        Assert.assertFalse(result);
    }
    // TEST CASES FOR VALIDATING THE E-MAILS
    @Test
    public void givenEmail_WhenCorrect_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNoDomain_ShouldReturnFalse() {
        boolean result = userRegistration.validateEmail("abc@.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenNoDomainExtension_ShouldReturnFalse() {
        boolean result = userRegistration.validateEmail("abc@gmail");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenIncludesAtLeast1LetterAndHasDomain_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmail("a@go.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenIncludesSpecialSymbol_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmail("a-@go.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenIncludesUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmail("A@go.co");
        Assert.assertTrue(result);
    }
}