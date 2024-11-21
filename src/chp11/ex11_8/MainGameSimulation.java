package chp11.ex11_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("김전사"); //휴먼
        Knight uther = new HolyKnight("신전사"); //신성한능력을 가진
        Knight genji = new MagicKnight("마전사"); //마법능력을 가진

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer1 = (HolyKnight)uther;
        Healer healer2 = new HolyKnight("신사제");

        healer1.heal();
        healer1.recovery();
//        healer1.slash(); //Healer 인터페이스의 참조변수이므로 Healer 인터페이스를 통해 구현된 메소드만 호출할 수 있다.

        Magician magician1 = (MagicKnight)genji;
        magician1.magicShield();
        magician1.teleport();

        MagicKnight magicknight = new MagicKnight("마전사전사");
        magicknight.magicShield();
        magicknight.teleport();




    }
}
