package chp08.ex8_1;

public class MainHero {
    public static void main(String[] args) {
        Hero ironMan = new Hero("아이언맨", 100, 130);
        Hero Hulk = new Hero("헐크", 200, 100);

        System.out.println(ironMan);    //ironMan.ToString() println()에서는 생략도 가능
        System.out.println(Hulk);
    }
}
