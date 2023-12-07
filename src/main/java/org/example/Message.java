package org.example;

import org.example.services.MessageService;

public class Message {
    MessageService messageService;

    public Message(MessageService messageService) {
        this.messageService = messageService;
    }
    public String get() {
        return this.messageService.get();
    }
}
