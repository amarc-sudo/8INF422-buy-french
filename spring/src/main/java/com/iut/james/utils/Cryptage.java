package com.iut.james.utils;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cryptage {

    public static String SALT = "starkUpDabtionC'EstPlusFortQueToi";

    public static String crypteString(String password, String salt) throws NoSuchAlgorithmException {
        password = password + salt;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String result = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return result;
    }
}
