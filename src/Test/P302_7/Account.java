package Test.P302_7;

public class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean transfer(Account num, int balance) {
        if(this.balance > balance){
            this.balance -= balance;
        }
        num.setBalance(num.getBalance() + balance);
        return this.balance >= balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}
