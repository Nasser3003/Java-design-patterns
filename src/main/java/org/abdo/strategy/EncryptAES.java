package org.abdo.strategy;

public class EncryptAES implements EncryptionAlgorithm {

    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return (message + " Was Encrypted");
    }
}
