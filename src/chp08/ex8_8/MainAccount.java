package chp08.ex8_8;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {


        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.printf("계좌번호입력(5자리): ");
        String accountNumber = scan1.nextLine();
        System.out.printf("* 성명 입력: ");
        String name = scan1.nextLine();
        System.out.printf("* 비밀번호(4자리): ");
        String pwd = scan1.nextLine();
        System.out.printf("* 입금할 금액: ");
        int balance = scan2.nextInt();

//          처음 통장 개설했을 때
        Account acc = new Account(accountNumber, name, pwd, balance);
        System.out.println(acc.toString());

//          통장에서 2600000원 입금
        System.out.printf("* 입금할 금액: ");
        int deposit = scan2.nextInt();
        acc.deposit(deposit);
        System.out.println(acc.toString());
//          통장에서 200000원 출금
        System.out.printf("* 출금할 금액: ");
        int withdraw = scan2.nextInt();
        acc.withdraw(withdraw);
        System.out.println(acc.toString());


        System.out.printf("%s님의 통장 잔액은 %d원입니다.\n", acc.getName(), acc.getBalance());



        scan1.close();
        scan2.close();

    }
}
