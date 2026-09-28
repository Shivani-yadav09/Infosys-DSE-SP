import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] arr=new String[n];

        for(int i=0;i<n;i++){
            String s=sc.next();
            char[] ch= s.toCharArray();
            Arrays.sort(ch);

            arr[i]=new String(ch);

        }
        long answer=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    answer++;
                }
            }

        }
        System.out.println(answer);
        sc.close();
    }
    
}
