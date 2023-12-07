package org.exemple.test;

import org.example.Message;
import org.example.services.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class MessageTest {
    @Spy
    MessageService messageService;
    Message message;

    @BeforeEach
    public void before() {
        this.message = new Message(messageService);
    }

//    @Test
//    public void test() {
//        Mockito.when(MessageService.exists()).thenReturn(false);
//    }
    @DisplayName("Test MessageService.get()")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", message.get());
    }

}
