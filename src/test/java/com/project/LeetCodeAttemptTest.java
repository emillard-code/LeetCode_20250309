package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void shortestCommonSupersequenceTest() {

        assertEquals(3, LeetCodeAttempt.alternatingGroupsII(new int[]{0,1,0,1,0}, 3));

        assertEquals(2, LeetCodeAttempt.alternatingGroupsII(new int[]{0,1,0,0,1,0,1}, 6));

        assertEquals(0, LeetCodeAttempt.alternatingGroupsII(new int[]{1,1,0,1}, 4));

    }

}
