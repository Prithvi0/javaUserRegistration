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
}