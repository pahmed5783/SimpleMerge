/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        while(count1 < arr1.length && count2 < arr2.length && i < out.length) {
            if (arr1[count1] < arr2[count2]) {
                out[i] = arr1[count1];
                count1++;
                i++;
            } else {
                out[i] = arr2[count2];
                count2++;
                i++;
            }
        }
        while(count1 < arr1.length){
            out[i] = arr1[count1];
            count1++;
            i++;
        }
        while(count2 < arr2.length){
            out[i] = arr2[count2];
            count2++;
            i++;
        }
        return out;
    }
}
