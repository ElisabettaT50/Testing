import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManageExceptionTest {

    @Test
    void checkNumInRange() {
        int numToCheck = 12;
        int minNum = 10;
        int maxNum = 15;

        assertTrue(ManageException.checkNumInRange(numToCheck, minNum, maxNum));
    }

    @Test
    void checkNumNotInRange() {
        int numToCheck = 19;
        int minNum = 10;
        int maxNum = 15;

        assertTrue(ManageException.checkNumInRange(numToCheck, minNum, maxNum));
    }
}