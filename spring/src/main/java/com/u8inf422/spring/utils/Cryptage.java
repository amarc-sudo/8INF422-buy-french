package com.u8inf422.spring.utils;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Cryptage {

    private static final Random RANDOM = new SecureRandom();

    private Cryptage() {

    }


    public static final String SALT = "french";

    public static String crypteString(String password, String salt) throws NoSuchAlgorithmException {
        password += salt;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toUpperCase();
    }

    public static String getNextSalt() {
        byte[] salt = new byte[16];
        RANDOM.nextBytes(salt);
        return salt.toString();
    }
}
