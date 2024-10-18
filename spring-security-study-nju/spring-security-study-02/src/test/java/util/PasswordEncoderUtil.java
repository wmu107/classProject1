package util;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    @Test
    public void TestEncoderUtil(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = "123456";
        String encode = bCryptPasswordEncoder.encode(password);
        System.out.println(encode);
    }
}
