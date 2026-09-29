import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();

            if(num >0){
                sum=sum+num;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
