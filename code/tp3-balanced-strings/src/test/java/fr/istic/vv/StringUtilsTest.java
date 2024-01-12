package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.StringUtils.isBalanced;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {


    @Test
    public void spacePartitioning(){
        assertTrue(isBalanced(""));

        assertFalse(isBalanced("["));
        
        assertTrue(isBalanced("()"));
        assertTrue(isBalanced("[]"));
        assertTrue(isBalanced("{}"));

        assertTrue(isBalanced("a()rez[]"));
        assertTrue(isBalanced("rez(fds{dsfdsf[fsd]})"));
        
        assertFalse(isBalanced("rez(ffds[)]"));
    }
}