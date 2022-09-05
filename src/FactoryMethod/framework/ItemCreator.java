package framework;

public abstract class ItemCreator {
    
    
  
    public Item Create(){
        
        Item item;
        //step1
        requesttmInfo();
        item = createItem();
        //step3
        createItemLog();
        
        return item;
        system.
    }
    
    //아이템 생성하기 전에 데이터베이스에서 아이템 정보 요청
    abstract protected void requesttmInfo();
    //아이템 생성 후 아이템 복제 방지하기위 데이터베이스에 아이템 생성정보 저장
   	abstract protected void createItemLog();
    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();
    
}
