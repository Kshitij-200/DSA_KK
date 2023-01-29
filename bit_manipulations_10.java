package com.company;

public class bit_manipulations_10 {
    public static void main(String[] args) {

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int [] row : image){
            // reverse array
            for (int i = 0; i < (image[0].length + 1) / 2; i++){
                // swap
                int temp = row[i] ^ i;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
