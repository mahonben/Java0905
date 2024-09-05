package chp07.lab1;

public class Square {
    private int lenght;


    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public int getLenght() {
        int result = (int)Math.pow(lenght, 2);
        return result;
    }
    public void tt(){
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d\n", lenght, getLenght());
    }
}