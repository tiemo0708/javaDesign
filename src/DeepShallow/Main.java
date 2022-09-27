package DeepShallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setName("나비");
    
        
        
       // Cat yo = navi; //나비의 주소값을 "요"가 가져감, 낮은 수준의 복사(앝은 복사)
       	Cat yo = navi.copy();// 깊은복사
        yo.setName("요");
        
        System.out.println(navi.getName());
        System.out.println(yo.getName());
    }
}
