package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(alternatingGroupsII(new int[]{0,1,0,1,0}, 3));

        System.out.println(alternatingGroupsII(new int[]{0,1,0,0,1,0,1}, 6));

        System.out.println(alternatingGroupsII(new int[]{1,1,0,1}, 4));

    }

    public static int alternatingGroupsII(int[] colors, int k) {

        int alternatingGroups = 0;

        int previousColor = -1;
        int currentColor = -1;

        for (int i = 0; i < colors.length; i++) {

            boolean alternating = true;
            previousColor = colors[i];

            for (int j = i + 1; j < i + k; j++) {

                int currentIndex = j;
                if (j >= colors.length) { currentIndex = j - colors.length; }

                currentColor = colors[currentIndex];
                if (currentColor == previousColor) { alternating = false; }

                previousColor = currentColor;

            }

            if (alternating) { alternatingGroups++; }

        }

        return alternatingGroups;

    }

}
