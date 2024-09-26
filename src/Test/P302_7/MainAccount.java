package Test.P302_7;

public class MainAccount {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000) ;

        while (a.transfer(b,3000)){
            ;
        }

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
