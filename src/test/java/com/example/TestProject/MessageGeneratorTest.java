package com.example.TestProject;

import com.example.TestProject.helper.MessageGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {

    @Test
    void testGenerateMessageReturnsExpectedValue() {
        MessageGenerator generator = new MessageGenerator();
        String result = generator.getMessage();
        assertEquals("Hello India!!", result);
    }

    @Test
    void testGenerateMessageNotNull() {
        MessageGenerator generator = new MessageGenerator();
        assertNotNull(generator.getMessage());
    }

    // Add more tests as needed for different scenarios
}
