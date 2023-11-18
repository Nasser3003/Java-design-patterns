package org.abdo.strategy;

public class ChatClient {

    private EncryptionAlgorithm encryptor;

    public ChatClient(EncryptionAlgorithm encryptor) {
        this.encryptor = encryptor;
    }

    public void send(String message) {
        String encryptedMessage = encryptor.encrypt(message);
        System.out.println("Sending the encrypted message...");
        System.out.println(encryptedMessage + " AND SENT");
    }
}
