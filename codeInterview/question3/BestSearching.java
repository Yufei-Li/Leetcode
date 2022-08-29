package codeInterview.question3;

public class BestSearching {
    public int search(int[] array){
        int num = 0;
        while(num < array.length) {
            int currentNum = array[num];
            if (currentNum == num) {
                num += 1;
            }else{
                if (array[currentNum] == currentNum) {
                    return currentNum;
                }else{
                    int swapNum = array[currentNum];
                    array[currentNum] = currentNum;
                    array[num] = swapNum;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        BestSearching bestSearching = new BestSearching();
        int result = bestSearching.search(array);
        System.out.println(result);
    }
}
