import java.util.Scanner;
public class RemoveChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String result=n.substring(1,n.length()-1);
        System.out.println(result);

    }
}