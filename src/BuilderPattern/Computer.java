package BuilderPattern;

public class Computer {
    
    private String cpu;
    private String ram;
    private String storage;

    
    public Computer(String cpu, String ram, String storage) {
        super();
        
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getstorage() {
        return storage;
    }
    public void setstorage(String storage) {
        this.storage = storage;
    }

    
}
