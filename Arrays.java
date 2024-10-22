public class Arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Array with even index");
        for(int i=0; i<arr.length; i++){
                if(i%2==0){
                        System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        System.out.println("odd indexed array elements");
        for(int j=0; j<arr.length;j++){
            if(j%2!=0){
                System.out.print(arr[j] + " ");
            }
        }  
        System.out.println(); 
        System.out.println("square");     
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]*arr[i] + " ");
        }System.out.println();


        System.out.println("elements divisible by 2");
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
                sum+=arr[i];


            }
            
        }
        System.out.println();
        System.out.print("Sum of the elements divisible by 2:" +sum);
        }

    }

