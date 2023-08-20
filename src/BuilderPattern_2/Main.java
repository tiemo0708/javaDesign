package BuilderPattern_2;

public class Main {
    public static void main(String[] args) {

        Student student = new StudentBuilder()
                .id(2016120091)
                .name("임꺽정")
                .grade("Senior")
                .phoneNumber("010-5555-5555")
                .build();
//메서드 체이닝
        System.out.println(student);
    }
}
