package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(alternatingGroupsII(new int[]{0,1,0,1,0}, 3));

        System.out.println(alternatingGroupsII(new int[]{0,1,0,0,1,0,1}, 6));

        System.out.println(alternatingGroupsII(new int[]{1,1,0,1}, 4));

    }

    // This method returns the number of alternating groups in int[] colors that are of size int k.
    public static int alternatingGroupsII(int[] colors, int k) {

        // We will store our answer in int alternatingGroups.
        int alternatingGroups = 0;

        // In order to test for alternating colors, we will have two int values to keep track
        // of what the color of the previous index is, as well as the color of the current index.
        int previousColor = -1;
        int currentColor = -1;


        // We will then begin loop through int[] colors.
        for (int i = 0; i < colors.length; i++) {

            // We will set boolean alternating to true as a default, and set it false
            // if at any point the same color is observed two indexes in a row.
            boolean alternating = true;

            // We will also set int previousColor to the color of the current index.
            previousColor = colors[i];

            // Then, for each element in int[] colors, we will look at the next (inclusive)
            // int k consecutive tiles to make sure that they are all alternating.
            for (int j = i + 1; j < i + k; j++) {

                // In order to make sure the loop does not go out of bounds,
                // we have int currentIndex loop back to the beginning when
                // int j ends up surpassing the bounds of int[] colors.
                int currentIndex = j;
                if (j >= colors.length) { currentIndex = j - colors.length; }

                // If at any point the current tile's color ends up being the same as the
                // previous tile's color, we set boolean alternating as false.
                currentColor = colors[currentIndex];
                if (currentColor == previousColor) { alternating = false; }

                // After we performed our check, we update int previousColor to be the current
                // tile's value.
                previousColor = currentColor;

            }

            // If we looked through int k consecutive tiles and found that they were all
            // alternating, then we increment int alternatingGroups by 1 to indicate this.
            if (alternating) { alternatingGroups++; }

        }

        // At the end of the method, we return whatever the value of int alternatingGroups is.
        return alternatingGroups;

    }

}
