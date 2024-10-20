import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2022211831_4_Test {

    @Test
    void maximumGap() {
        Solution4 solution4 = new Solution4();
        int[] test= {3,6,7,14,25,16};
        int result = solution4.maximumGap(test);
        assertEquals(9, result);
    }
}