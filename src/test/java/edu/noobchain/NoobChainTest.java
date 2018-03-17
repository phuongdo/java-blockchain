package edu.noobchain;

import edu.noobchain.version1.StringUtil;
import org.junit.Test;

public class NoobChainTest {

    @Test
    public void testBlock() {
        int difficulty = 3;
        String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0"
        System.out.println(new String(new char[difficulty]));
        System.out.println(target);
    }


}