package com.tpam.inviteme.utils;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cryptage {

    private Cryptage() {

    }

    public static final String SALT = "aoi";

    public static String crypteString(String password) throws NoSuchAlgorithmException {
        password += SALT;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toUpperCase();
    }
}
