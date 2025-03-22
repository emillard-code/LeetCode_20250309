package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void numberOfAlternatingGroupsTest() {

        assertEquals(3, LeetCodeSolution.numberOfAlternatingGroups(new int[]{0,1,0,1,0}, 3));

        assertEquals(2, LeetCodeSolution.numberOfAlternatingGroups(new int[]{0,1,0,0,1,0,1}, 6));

        assertEquals(0, LeetCodeSolution.numberOfAlternatingGroups(new int[]{1,1,0,1}, 4));

    }

}
