/*
This code is faster than 100% of the submissions. 1ms! 

Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
*/


class Solution {
    public int[] sortArrayByParity(int[] A) {
        int [] B = new int[A.length];
        int j = 0;
        int l = 0;
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                B[l] = A[i];
                l++;
            }
            else {
                B[B.length-j-1] = A[i];
                j++;
            }
        }
        return B;
    }
}
