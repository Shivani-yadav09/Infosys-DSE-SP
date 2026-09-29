import java.util.Scanner;
 public class MissingNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int actualSum=0;
        for(int i=0;i<n-1;i++){
            int num=sc.nextInt();
            actualSum=actualSum+num;
        }

        int expectedSum=0;
        int[] arr=new int[n];
        int sum=0;
        for(int i=1;i<=n;i++){
            //arr[i]=sc.nextInt();
            expectedSum=expectedSum+i;
        }
        int MissingNum=expectedSum-actualSum;

        System.out.println("Missing= "+MissingNum);
        System.out.println("actual ="+actualSum);
        System.out.println("expected= "+expectedSum);
        sc.close();
    }
 }



































// import java.util.Scanner;
// public class MissingNum {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int[] arr=new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();

//         }
//         int sum=0;
//         for(int i=0;i<n;i++){
//             //arr[i]=i;
//             sum=sum+arr[i];
//         }
//         int actualSum=0;
//         for(int i=0;i<n;i++){
//             actualSum=actualSum+i;

//         }
//         int result=actualSum-sum;
//         System.out.println(result);
//         System.out.println("Actual= "+sum);
//         System.out.println(sum);
//     }
    
// }
