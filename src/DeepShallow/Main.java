package DeepShallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setName("나비");
    	navi.setAge(new Age(2020,3));
        
        
       // Cat yo = navi; //나비의 주소값을 "요"가 가져감, 낮은 수준의 복사(앝은 복사)
       	Cat yo = navi.copy();// 깊은복사
        yo.setName("요");
        //yo.setAge(new Age(2021,2));
        yo.getAge().setYear(2021);
         yo.getAge().setValue(2);
        
        System.out.println(navi.getName());
        System.out.println(yo.getName());
        
         System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear());
        
          System.out.println(navi.getAge().getValue());
        System.out.println(yo.getAge().getValue());
        
        
    }
}
