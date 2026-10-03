import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        //char[] ch=s.toCharArray();
        boolean palindrome=true;
        for(int i=0;i<s.length()/2;i--){
            //System.out.print(ch[i]);
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                palindrome=false;
                break;
            }
            
            

        }
        if(palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
