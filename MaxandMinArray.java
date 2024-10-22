public class Maxminarray {
    public static void main(String[] args) {
        int arr[] = {39,35,32,68,2,57,54};
        int max =arr[0];
        int min =arr[0];

        for(int i=0;i<arr.length-1;i++){
           if(arr[i]>max){
            max=arr[i];
           }
           if(arr[i]<min){
            min=arr[i];
           }
        }
        System.out.println("Maximum nb." + max);
        System.out.println("Minimum nb." + min);
    }
}
