import java.util.Scanner;

public class Main {
    public static int positiveNumber(int[] arr){
        int count=0 ;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0)
                count++;
        }
        return count;
    }

    public static int negativeNumber(int[] arr){
        int count=0 ;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0)
                count++;
        }
        return count;
    }

    public static int oddNumber(int[] arr){
        int count=0 ;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==1)
                count++;
        }
        return count;
    }

    public static int evenNumber(int[] arr){
        int count=0 ;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0)
                count++;
        }
        return count;
    }
    public static int zeroNumber(int[] arr){
        int count=0 ;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int pos_int = positiveNumber(arr);
        System.out.println("Number of positive integers:"+pos_int);

        int neg_int = negativeNumber(arr);
        System.out.println("Number of negative integers:"+neg_int);

        int odd_int = oddNumber(arr);
        System.out.println("Number of odd integers:"+odd_int);

        int even_int = evenNumber(arr);
        System.out.println("Number of even integers:"+even_int);

        int zero_int = zeroNumber(arr);
        System.out.println("Number of zero integers:"+zero_int);

        System.out.println("Hi! I'm Sowmi");
    }
}