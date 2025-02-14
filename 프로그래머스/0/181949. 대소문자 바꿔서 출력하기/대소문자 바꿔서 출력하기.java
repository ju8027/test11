import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder b = new StringBuilder(a.length());
        
        for (char c : a.toCharArray()){
            b.append(Character
                     .isUpperCase(c) 
                     ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        System.out.println(b.toString());
        sc.close();
    }
}