package chp08.ex8_8;

public class Account {

    private String accNumber;
    private String name;
    private String pwd;
    private int balance;

    public Account(String accNumber, String name, String pwd, int balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
//      입금하는 메소드: deposit
    public void deposit(int money) {
        balance += money;
    }

//      출금하는 메소드: withdrow
    public void withdraw(int money) {
        balance -= money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", accNumber='" + accNumber + '\'' +
                '}';
    }

}
