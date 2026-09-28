import java.util.*;
public class GroupAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        LinkedHashMap<String, ArrayList<String>> map=new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            String s=sc.next();
            char[] ch=s.toCharArray();
            Arrays.sort(ch);

            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
              map.get(key).add(s);
        }
        for (ArrayList<String> group : map.values()) {

            Collections.sort(group);

            for (int i = 0; i < group.size(); i++) {

                if (i > 0) {
                    System.out.print(" ");
                }

                System.out.print(group.get(i));
            }

            System.out.println();
        }

        sc.close();
    }
}
