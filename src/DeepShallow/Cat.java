package DeepShallow;

public class Cat implements Cloneable {
    
    private String name;
    

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
    public Cat copy() throws CloneNotSupportedException {
        Cat ret =(Cat)this.clone();
         return ret; 
    }
}
