import java.util.Scanner;
public class LongestPrefix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr= new String[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        String prefix=arr[0];
        for(int i=0;i<n;i++){
            int j=0;
            while(j<prefix.length()&&  j<arr[i].length()&&  prefix.charAt(j) == arr[i].charAt(j)){
                j++;
            }
            prefix=prefix.substring(0,j);
            if(prefix.length()==0){
                break;
            }
        }
        System.out.println(prefix);
        sc.close();

    }
}