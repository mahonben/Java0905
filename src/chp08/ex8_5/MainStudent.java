package chp08.ex8_5;
// 2024-09-19
public class MainStudent {
    
    public static void main(String[] args) {
        Student s1 = new Student(20240101, "마");
        Student s2 = new Student(20240202, "현");
        Student s3 = new Student(20240303, "빈");

        System.out.printf("생성된 Student 객체의 개수: %d개", Student.count);

        
    }
    
}
