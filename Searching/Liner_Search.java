

public class Liner_Search{
    public static void main(String[] args) {
        int[] arr = {2 , 32 , 343 , 6 , 122, 37, -23};
        int n = -23;
        int position = linearSearch(arr, n);
        System.out.print("Found In "+position + " Position");
    }

    static int linearSearch(int[] arr , int target){


        if(arr.length == 0)
            return -1;

        int i,element=0;
        for(i = 0; i < arr.length; i++){
        element = arr[i];
        if(element == target){
            return i+1;
        }
    }
    return -1;
    }
}