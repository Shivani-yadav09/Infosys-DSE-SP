import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();

        long answer=0;

        for(int i=0;i<n;i++){
            char ch= s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                long count=(long)(i+1)*(n-i);
                answer=answer+count;
            }
        }
        System.out.println(answer);
        sc.close();

    }
}
