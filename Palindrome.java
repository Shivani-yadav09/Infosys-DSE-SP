import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
       int[] old=new int[n];
       for(int i=0;i<n;i++){
            old[i]=arr[i];
       }

        int left=0;
        int right=n-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;


            
            left++;
            right--;
        }


        boolean palindrome=true;
        for(int i=0;i<n;i++){
        if(old[i]!=arr[i]){
            palindrome=false;
            break;
        }
    }
        if(palindrome=true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
