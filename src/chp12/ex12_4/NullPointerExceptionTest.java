package chp12.ex12_4;

import java.util.ArrayList;

public class NullPointerExceptionTest {
//      참조변수를 선언만하고 객체 참조값을 대입하지 않은 상태로 사용하면 NullPointerException이 발생한다
    ArrayList<String> listnames = new ArrayList<String>();
//    ArrayList<String> listnames;

    public void addName(String name) {
        listnames.add(name);
    }

    public void printAllNames() {
        for (String name : listnames) {
            System.out.println(name);
        }
    }
}
