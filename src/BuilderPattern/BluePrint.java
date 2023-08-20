package BuilderPattern;
     // Builder 설계도 (abstract class)
public abstract class BluePrint {

    //Build part야
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setstorage();
    abstract public Computer getComputer();
}
