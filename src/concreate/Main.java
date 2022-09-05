package concreate;
import framework.Item;
import framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
    	ItemCreator creator;
    	Item item;
        
    	creator = new HpCreator();
    	item = creator.Create();
        
        item.use();
        
    	creator = new MpCreator();
    	item = creator.Create();
        item.use();
       
    }
}
