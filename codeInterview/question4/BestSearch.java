package codeInterview.question4;

public class BestSearch {
    private int count(int[] array, int n){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                result += 1;
            }
        }
        return result;
    }

    public int search(int[] array){
        BestSearch bestSearch = new BestSearch();
        int[] searchRange = new int[]{1, array.length - 1};
        while(searchRange[1] != searchRange[0]){
            int middlePoint = (searchRange[1] + searchRange[0]) >> 1;
            int firstPartCount = 0;
            for (int i = searchRange[0]; i <= middlePoint; i++) {
                firstPartCount += bestSearch.count(array, i);
            }
            if (searchRange[1] - searchRange[0] == 1) {
                if (firstPartCount <= middlePoint) {
                    return searchRange[1];
                }else{
                    return searchRange[0];
                }
            }
            if (firstPartCount <= middlePoint) {
                searchRange = new int[]{middlePoint, searchRange[1]};
            }else{
                searchRange = new int[]{searchRange[0], middlePoint};
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 5, 4, 3, 2, 6, 7};
        BestSearch bestSearch = new BestSearch();
        int result = bestSearch.search(array);
        System.out.println(result);
    }
}
