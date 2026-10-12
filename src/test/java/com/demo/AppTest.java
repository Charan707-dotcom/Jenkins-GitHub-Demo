
package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testGetMessage() {
        App app = new App();

        assertEquals(
            "Hello from Jenkins CI/CD!",
            app.getMessage()
        );
    }

    @Test
    void testAddition() {
        App app = new App();

        assertEquals(30, app.add(10, 20));
    }
}
