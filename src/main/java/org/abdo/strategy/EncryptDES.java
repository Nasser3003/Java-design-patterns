package org.abdo.strategy;

public class EncryptDES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return (message + " Was Encrypted");
    }
}
