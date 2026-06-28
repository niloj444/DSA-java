public class NextGreatsLetter {

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'j';

        System.out.println(solution(letters, target));
    }

    static char solution(char[] letters, char target) {

        // Start of the search range
        int start = 0;

        // End of the search range
        int end = letters.length - 1;

        // Binary Search
        while (start <= end) {

            // Find the middle index safely
            int mid = start + (end - start) / 2;

            // If target is smaller, search left half
            if (target < letters[mid]) {
                end = mid - 1;
            }

            // Otherwise search right half
            else {
                start = mid + 1;
            }
        }

        // In a normal ceiling problem we would return:
        // return start;

        // But here we need the actual character.
        // Also, if target is greater than or equal to
        // the largest letter, start becomes letters.length.
        // Using modulo wraps it back to index 0.

        return letters[start % letters.length];
    }
}