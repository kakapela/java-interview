package codility.lesson_5.passing_cars;

public class Solution {

    /**
     * First solution - O(n**2), gets 50%
     * @param A - array contains only 0 & 1 integers
     * @return number of pairs (P,Q) <=> 0 ≤ P < Q < N
     */
    public int solution(int[] A) {
        int pairs = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) continue;
            for (int k = i + 1; k < A.length; k++) {
                if (A[i] < A[k])
                    pairs++;
            }
        }
        return pairs <= 1_000_000_000 ? pairs : -1;
    }

    /**
     * First solution - O(n), gets 100%
     * @param A - array contains only 0 & 1 integers
     * @return number of pairs (P,Q) <=> 0 ≤ P < Q < N
     */
    public int solution2(int[] A) {
        int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) countOfZeros++;
            if (A[i] == 1) count += countOfZeros;
            if (count > 1000000000) return -1;
        }
        return count;
    }
}
