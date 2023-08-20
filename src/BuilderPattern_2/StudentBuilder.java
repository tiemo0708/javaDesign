package BuilderPattern_2;

public class StudentBuilder extends Builder {
    // private int id;
    // private String name;
    // private String grade;
    // private String phoneNumber;

    private Builder builder;

    public StudentBuilder(){
        builder = new Builder();
    }
    @Override
    public StudentBuilder id(int id) {
        builder.id = id;
        return this;
    }

    @Override
    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder grade(String grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public StudentBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public Student build() {
        return new Student(id, name, grade, phoneNumber); // Student 생성자 호출
    }
}
