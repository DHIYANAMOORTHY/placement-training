import java.util.*;

public class count {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[5];
     System.out.println("Enter the 5 number :");
     for(int i=0 ; i< arr.length ; i++)
     {
      arr[i]= sc.nextInt();
     }

     int count = 0;

     System.out.println("Enter the target: ");
     int target = sc.nextInt();
    
    for(int i=0; i<arr.length;i++)
    {
       if(arr[i] == target)
       {
        count++;
       }
    }
  System.out.println("count : " +count);
    }
}