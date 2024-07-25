package org.example.arrays.binarySearch;

import java.util.Arrays;

public class BS_2D_SortedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int target = 5;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while(cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart)/2;
            if(matrix[row][cMid] == target) {
                return new int[]{row,cMid};
            }
            if(matrix[row][cMid] < target){
                cStart = cMid + 1;
            } else {
                cEnd = cMid -1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautions matrix may be empty

        if(rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        // run the loop till we get two rows remaining
        while(rStart < (rEnd-1)) { // if this is true then it will have more than 2 rows which we wull need to eliminate
            int rMid = rStart + (rEnd-rStart)/2;
            if(matrix[rMid][cMid] == target) {
                return new int[]{ rMid, cMid};
            }
            if( matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }
        if(matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target) {
            return new int[]{rStart+1, cMid};
        }
        //Search 1st half of matrix
        if(target <= matrix[rStart][cMid-1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //Search 2md half of matrix
        else if(target >= matrix[rStart][cMid-1] && target <= matrix[rStart][cols-1]) {
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        //Search 3rd half of matrix
        else if(target <= matrix[rStart+1][cMid-1]) {
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        //Search 4th half of matrix
        else {
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }

    }
}
