package org.example.bitwiseOperations;

public class FlipImage {

    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] img : image) {
            for(int i=0; i < (img.length+1)/2; i++) {
                int temp = img[i] ^ 1;
                img[i] = img[img.length-1-i] ^ 1;
                img[img.length-1-i] = temp;
            }
        }
        return image;
    }
}
