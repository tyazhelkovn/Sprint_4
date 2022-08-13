import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class AccountTest {

    @Test
    public void successCheckNameToEmbossWithShortName() {
        Account account = new Account("T T");
        boolean actual = account.checkNameToEmboss();
        assertEquals(true, actual);
    }

    @Test
    public void successCheckNameToEmbossWithLongName() {
        Account account = new Account("Testtest Testtestst");
        boolean actual = account.checkNameToEmboss();
        assertEquals(true, actual);
    }

    @Test
    public void checkNameToEmbossWithBlankBeforeName() {
        Account account = new Account(" Test Test");
        boolean actual = account.checkNameToEmboss();
        assertEquals(false, actual);
    }

    @Test
    public void checkNameToEmbossWithBlankAfterName() {
        Account account = new Account("Test Test ");
        boolean actual = account.checkNameToEmboss();
        assertEquals(false, actual);
    }

    @Test
    public void checkNameToEmbossWithoutBlankInName() {
        Account account = new Account("TestTest");
        boolean actual = account.checkNameToEmboss();
        assertEquals(false, actual);
    }

    @Test
    public void checkNameToEmbossWithSeveralBlanksInName() {
        Account account = new Account("Test Test Test");
        boolean actual = account.checkNameToEmboss();
        assertEquals(false, actual);
    }

    @Test
    public void checkNameToEmbossWithOverShortName() {
        Account account = new Account("T");
        boolean actual = account.checkNameToEmboss();
        assertEquals(false, actual);
    }

    @Test
    public void checkNameToEmbossWithOverLongName() {
        Account account = new Account("Testtesttest Testestestes");
        boolean actual = account.checkNameToEmboss();
        assertEquals(false, actual);
    }
}
