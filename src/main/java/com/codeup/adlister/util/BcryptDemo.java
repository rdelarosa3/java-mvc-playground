package com.codeup.adlister.util;

import org.mindrot.jbcrypt.BCrypt;

public class BcryptDemo {
    public static void main(String[] args) {
        String password = "password123";
//    hashes password salt ads rounds of hash
        String hash = BCrypt.hashpw( password , BCrypt.gensalt());
        System.out.println("hash = " + hash);
        
        boolean passwordsMatch = BCrypt.checkpw("passord123",hash);
        System.out.println("passwordsMatch = " + passwordsMatch);
        passwordsMatch = BCrypt.checkpw("password123",hash);
        System.out.println("passwordsMatch = " + passwordsMatch);
    }
    
}
