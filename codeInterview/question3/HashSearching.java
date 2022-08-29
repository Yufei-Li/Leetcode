package codeInterview.question3;

import java.util.Hashtable;

public class HashSearching {
    public int search(int[] array){
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            if (hashtable.containsKey(array[i])){
                return array[i];
            }else{
                hashtable.put(array[i], array[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        HashSearching hashSearching = new HashSearching();
        int result = hashSearching.search(array);
        System.out.println(result);
    }
}
