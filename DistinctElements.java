import java.util.Scanner;
import java.util.HashMap;
class CountDistinctWindow {
    static void countDistinct(int arr[], int k)
    {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for (int i = 0; i < k; i++)
            set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
  
        System.out.println(set.size());
        for (int i = k; i < arr.length; i++) {
            if (set.get(arr[i - k]) == 1) {
                set.remove(arr[i - k]);
            }
  
            else 
                set.put(arr[i - k],  set.get(arr[i - k]) - 1);            
            set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
            System.out.println(set.size());
        }
    }
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements in array: ");
        int n=sc.nextInt();
        int[] array = new int[10]; 
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {     
            array[i]=sc.nextInt();  
        }
        System.out.println("Enter k: ");
        int k=sc.nextInt();
		countDistinct(array, k);
        sc.close();
	}
}
