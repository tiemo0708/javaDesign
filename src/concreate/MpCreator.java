package concreate;
import java.util.Date;
import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {
    @Override
	protected void requesttmInfo() {
	System.out.println("데이터베이스에 마력 물약의 정보를 가져옵니다");
	}
    
    @Override
	protected void createItemLog() {
	System.out.println("마력 회복 물약을 새로 생성했습니다"+new Date());
	}
    @Override
	protected Item createItem() {
		return new MpPotion();
	}
}
