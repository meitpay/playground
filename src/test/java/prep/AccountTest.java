package prep;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private final double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void depositCannotBeNegative() {
        Account account = new Account(-20);
        Assert.assertFalse(account.deposit(-20));
    }

    @Test
    public void withDrawCannotBeNegative() {
        Account account = new Account(100);
        Assert.assertFalse(account.withdraw(-20));
    }

    @Test
    public void withDrawAndDepositWillReturnTrue() {
        Account account = new Account(100);
        Assert.assertEquals(true, account.deposit(100));
        Assert.assertEquals(true, account.withdraw(20));
        Assert.assertEquals(80d, account.getBalance(), epsilon);
    }

    @Test
    public void accountCannotWithdrawOverDraftLimit() {
        Account account = new Account(100);
        account.deposit(200);
        account.withdraw(400);

        Assert.assertEquals(200L, account.getBalance(), epsilon);

    }


}