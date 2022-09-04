package framework;

public abstract class ItemCreator {
    
    
  
    public Item Create(){
        
        Item item;
        
        return item;
        
    }
    
    //아이템 생성하기 전에 데이터베이스에서 아이템 정보 요청
    abstract protected void requesttmInfo();
    //아이템 생성 후 아이템 복제 방지하기위 데이터베이스에 아이템 생성정보 저장
   abstract protected void createItemLog();
    
}
