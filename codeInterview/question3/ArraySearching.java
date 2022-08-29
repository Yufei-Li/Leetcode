package codeInterview.question3;

import java.util.Arrays;

public class ArraySearching {
    public int search(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        Arrays.sort(array);
        ArraySearching arraySearching = new ArraySearching();
        int result = arraySearching.search(array);
        System.out.println(result);
    }
}
