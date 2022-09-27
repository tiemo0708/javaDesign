package DeepShallow;

public class Cat implements Cloneable {
    
    private String name;
    private Age age;
    
    

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
    
public void setAge(Age age) {
	this.age = age;
}

public Age getAge() {
	return age;
}
    public Cat copy() throws CloneNotSupportedException {
        Cat ret =(Cat)this.clone();
        ret.setAge(new Age(this.age.getYear(), this.age.getValue())); //명시적 깊은 복사
         return ret; 
    }
}
