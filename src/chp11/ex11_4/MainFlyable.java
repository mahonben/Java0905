package chp11.ex11_4;

import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter hc = new Helicopter();
        Rocket rc = new Rocket();
//        배열에 각 객체의 참조값을 저장한다.
        Flyable[] flyables = {bird, hc, rc};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
        System.out.println("********************************");
        ArrayList<Flyable> flyableList = new ArrayList<Flyable>();
        flyableList.add(hc);
        flyableList.add(rc);
        flyableList.add(bird);

        for (Flyable flyable : flyableList) {
            flyable.fly();
        }

    }
}
