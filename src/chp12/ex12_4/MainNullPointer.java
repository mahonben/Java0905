package chp12.ex12_4;

public class MainNullPointer {
    public static void main(String[] args) {
        NullPointerExceptionTest nullTest = new NullPointerExceptionTest();

        nullTest.addName("aaa");
        nullTest.addName("mmm");

        nullTest.printAllNames();
    }
}
