import java.util.HashMap;

public class IdAndPassword {
    HashMap<String, String>  loginInfo = new HashMap<>();

    IdAndPassword(){
        loginInfo.put("bro","pizza");
        loginInfo.put("user","password");
        loginInfo.put("pass","abc123");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
