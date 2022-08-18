package TemplateMethod;

public class AbstGameConnectHelper {
    // 알고리즘의 단계이기위해 외부노출되면 안되기에
    // 외부에선 호출불가능, 하위 클래스에서 사용할 수 있도록 
    // protected
    abstract protected String doSecurity(String info);

	abstract protected String authentication(String id, String password);

	abstract protected int authorization(String userName);

	abstract protected String connection(String info);
    
    public String requestConnection(String info) {
        
    }
}
