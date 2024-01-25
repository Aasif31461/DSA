package Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{2,63,1,3}, 0));
    }
    
    public static int largest(int arr[], int n)
    {
        int largestElement = arr[0];
        for(int i=0; i<arr.length;i++){
            if(largestElement<arr[i])
            largestElement = arr[i];
        }
        return largestElement;
    }
}