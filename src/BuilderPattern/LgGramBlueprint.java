package BuilderPattern;

// ConcreateBuilder(구체적 구현)
public class LgGramBlueprint extends BluePrint {

    private Computer computer;

    public LgGramBlueprint(){
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setstorage() {
        computer.setstorage("256g ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
        
    }

}
