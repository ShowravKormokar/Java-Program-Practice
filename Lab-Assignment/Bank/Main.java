public class Main{
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Showrav Kormokar");
        acc.setAccountNo(222311077);
        acc.deposit(1000);

        System.out.println("Account Holder:- " + acc.getAccountHolder());
        System.out.println("Account No.:- " + acc.getAccountNo());

        acc.withdraw(550);
        System.out.println("Current Balance:- BDT" + acc.getBalance());
    }
}

// Name: Showrav Kormokar
// ID: 222311077
// Section: B