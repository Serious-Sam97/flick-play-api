package com.serioussam.flickplay.util;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
    private static BCryptPasswordEncoder bCryptPasswordEncoder;

    public static String hashPassword(String password)
    {
        return bCryptPasswordEncoder.encode(password);
    }

    public static boolean verifyPassword(String rawPassword, String encodedPassword)
    {
        return bCryptPasswordEncoder.matches(rawPassword, encodedPassword);
    }
}
