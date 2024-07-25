package org.example.stack.queues;

public class MinInsertions {
    public int minInsertions(String s) {
        int insertions = 0;
        int needed = 0;  // Track the number of ')' needed
        int i = 0;
        int n = s.length();

        while (i < n) {
            char c = s.charAt(i);

            if (c == '(') {
                // Each '(' pushes a need for two ')'
                needed += 2;

                // If needed is odd, we must have had a single ')' before this
                // We need to insert one ')' to balance the previous unpaired ')'
                if (needed % 2 != 0) {
                    insertions++;   // Insert one ')'
                    needed--;       // Now we need one less ')'
                }
            } else {  // We encounter ')'
                needed--;

                if (needed < 0) {
                    insertions++;  // Insert one '('
                    needed += 2;   // This adds a need for one more ')'
                }

                // Check if next character is also ')', to account for consecutive '))'
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i++;  // Move to next character as it's a valid pair
                } else {
                    // If there's no consecutive ')', we need to insert one
                    insertions++;
                    needed--;  // Adjust needed since we're inserting
                }
            }
            i++;
        }

        // If we still have unmatched '(', add the required ')'
        insertions += needed;

        return insertions;
    }

    public static void main(String[] args) {
        MinInsertions solution = new MinInsertions();
        String s = "(()))(()))()())))";
        int result = solution.minInsertions(s);
        System.out.println("Minimum insertions needed: " + result);
    }

}
