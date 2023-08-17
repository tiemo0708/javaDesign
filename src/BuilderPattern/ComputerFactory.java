package BuilderPattern;

public class ComputerFactory {

    private BluePrint print;

    public void setBlueprint(BluePrint print) {
        this.print = print;
    }

    public void make() {
        print.setRam();
        print.setCpu();
        print.setstorage();
    }

    public Computer getComputer() {
        return print.getComputer();
    }

}
