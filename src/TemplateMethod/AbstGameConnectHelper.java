// package TemplateMethod;

// public class AbstGameConnectHelper {
//     // 알고리즘의 단계이기위해 외부노출되면 안되기에
//     // 외부에선 호출불가능, 하위 클래스에서 사용할 수 있도록 
//     // protected
//     abstract protected String doSecurity(String info);

// 	abstract protected String authentication(String id, String password);

// 	abstract protected int authorization(String userName);

// 	abstract protected String connection(String info);
    
//     //템플릿 메소드
//     public String requestConnection(String info) {
        
//         //보안 작업 -> 암호화 된 문자열을 디코드(복호화) 한다
//        String decodedInfo = doSecurity(info);
//         //반환된 것을 가지고 아이디, 암호를 할당한다.
        
//         String id = "aaa";
//         String password = "bbb";
        
//       if(authentication(id, password)){
//           throw new Error("아이디 암호 불일치");
//       }
            
//         String userName = "userName";
//         int result = authorization(userName);
        
//         switch (result) {

// 		case 0:// 무료회원
// 			break;
// 		case 1:// 유료회원
// 			break;
// 		case 2:// 게임 마스터
// 			break;
// 		case 3:// 접속 권한 없음
// 			break;
// 		default:
// 			break;
// 		}
        
            
//         return connection();
//     }
// }
