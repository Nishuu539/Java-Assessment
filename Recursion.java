import java.util.*;
class Recursion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();
        System.out.println(removeDuplicate(str));
        sc.close();
    }
    public static String removeDuplicate(String str) {
        if (str == null || str.length() <=1) {
            return str;
        }
 
        char[] charArray = str.toCharArray();
        int i, k = 0;
        for (i = 1; i < charArray.length; i++)
        {
         
            if (charArray[i - 1] != charArray[i]) {
                charArray[k++] = charArray[i - 1];
            }
            else {
                while (i < charArray.length && charArray[i - 1] == charArray[i]) {
                    i++;
                }
            }
        }

        charArray[k++] = charArray[i - 1];
        String s = new String(charArray).substring(0, k);
        if (k != charArray.length) {
            return removeDuplicate(s);            
        }
        return s;
    }
 
}