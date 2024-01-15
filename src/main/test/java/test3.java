import Jason.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class test3 {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assertions.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void accountCannotHaveNegativeDepositAndWithdraw(){
        Account account = new Account(0);
        Assertions.assertFalse(account.deposit(-1));
        Assertions.assertFalse(account.withdraw(-1));
    }

    @Test
    public void accountCannotOverdraftLimit(){
        Account account = new Account(20);
        Assertions.assertTrue(account.withdraw(10));
        Assertions.assertFalse(account.withdraw(10));
        Assertions.assertFalse(account.withdraw(11));

    }

    @Test
    public void accountCorrectCount(){
        Account account = new Account(20);
        account.deposit(10);
        Assertions.assertEquals(10d,account.getBalance());
        account.withdraw(5);
        Assertions.assertEquals(5d,account.getBalance());
    }

    @Test
    public void accountCorrectResults(){
        Account account = new Account(20);
        Assertions.assertTrue(account.deposit(10));
        Assertions.assertTrue(account.withdraw(5));

    }
}