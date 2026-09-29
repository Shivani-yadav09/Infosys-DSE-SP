import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];
        int largest=0;
        int SecondLargest=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];

            }
            else if (arr[i] > SecondLargest && arr[i] != largest){
                SecondLargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(SecondLargest);
    }
}
