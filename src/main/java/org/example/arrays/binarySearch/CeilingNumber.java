package org.example.arrays.binarySearch;

    public class CeilingNumber {
        public static void main(String[] args) {
            int[] arr = {2,3,5,9,14,16,18};
            int target = 15;
            System.out.println(findFloorNumber(arr, target));
            char[] chars = {'c','f','j','m', 'n', 't'};
            char target1 = 'c';
            System.out.print(nextGreatestLetter(chars,target1));
        }

        static int findCeilingNumber(int[] arr, int target) {

            int start = 0;
            int end = arr.length-1;
            while(start <= end) {
                int mid = start + ((end-start)/2);
                if(arr[mid] < target) {
                    start = mid +1;
                } else if(arr[mid] > target) {
                    end = mid -1;
                } else if(arr[mid] == target) {
                    return arr[mid];
                }
            }
            return arr[start];
        }

        static int findFloorNumber(int[] arr, int target) {
            int start = 0;
            int end = arr.length-1;
            while(start <= end) {
                int mid = start + ((end-start)/2);
                if(arr[mid] < target) {
                    start = mid +1;
                } else if(arr[mid] > target) {
                    end = mid -1;
                } else if(arr[mid] == target) {
                    return arr[mid];
                }
            }
            return arr[end];
        }

        public static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;
            while(start <= end) {
                int mid = start + ((end-start)/2);
                if(letters[mid] > target) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
            return letters[start%letters.length];

        }


    }
