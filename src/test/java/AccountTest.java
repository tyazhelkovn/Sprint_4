import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"T T", true},
                {"Testtest Testtestst", true},
                {" Test Test", false},
                {"Test Test ", false},
                {"TestTest", false},
                {"Test Test Test", false},
                {"T", false},
                {"Testtesttest Testestestes", false},
                {" Testtesttest  Testestestes", false},
                {"Testtesttest  Testestestes ", false}
        };
    }

    @Test
    public void successCheckNameToEmbossWithShortName() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expectedResult, actual);
    }

    @Test(expected = NullPointerException.class)
    public void getNullNameException() {
        Account account = new Account(null);
        account.checkNameToEmboss();
    }
}
