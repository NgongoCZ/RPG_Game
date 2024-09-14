import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Character_CreationTest {

    @Test
    public void getNameTest() {
        Character_Creation character = new Character_Creation("TestName", "testClass", "testG", "testMOral");
        assertEquals("TestName", character.getName());
    }

}