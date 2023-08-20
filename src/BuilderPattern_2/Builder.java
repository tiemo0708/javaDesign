package BuilderPattern_2;

public abstract class Builder {

    abstract public StudentBuilder id();
    abstract public StudentBuilder name();
    abstract public StudentBuilder grade();
    abstract public StudentBuilder phoneNumber();
    abstract public Student build();

}
