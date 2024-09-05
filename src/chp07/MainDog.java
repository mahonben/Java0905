package chp07;

public class MainDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.setName("메카강아지");
        d1.setBreeds("AI로봇(무상 AS 기간: 10년)");
        d1.setAge(5);

        d2.setName("로봇강아지");
        d2.setBreeds("첨단로봇AI(무상 AS 기간: 5년)");
        d2.setAge(7);

        System.out.printf("d1 => (name: %s, breeds: %s, apg: %d)\n", d1.getName(), d1.getBreeds(), d1.getAge());
        System.out.printf("d2 => (name: %s, breeds: %s, apg: %d)\n", d2.getName(), d2.getBreeds(), d2.getAge());

        d1.wag();
        d2.wag();

        d1.bark();
        d2.bark();

        d1.bark(3,"위잉위잉!!");
        d2.bark(10,"위잉위잉!!!!");



    }

}
