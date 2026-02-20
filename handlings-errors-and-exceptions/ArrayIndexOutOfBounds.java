//This type of exceptions occurs if we try to store or retrieve data to the index that doesn't exist.

class ArrayIndexOutOfBounds {
   public static void main(String[] args) {
        int arr[] = {1,2,5,6};
        System.out.println(arr[5]);
   }
    
}