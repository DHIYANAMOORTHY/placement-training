import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

     int arr[]=new int[5];
     System.out.println("Enter 5 numbers: ");

     for(int i=0; i <arr.length; i++)
        {
         arr[i]=sc.nextInt();
        }

       int largest=arr[0];
       int secondLargest=arr[1];
       
       if(secondLargest > largest)
         {
              int temp=largest;
              largest=secondLargest;
              secondLargest=temp;
         }

         for(int i=2; i<arr.length; i++)
         {
             if(arr[i] > largest)
             {
                 secondLargest=largest;
                 largest=arr[i];
             }
             else if(arr[i] > secondLargest)
             {
                 secondLargest=arr[i];
             }
         }
         System.out.println("The second largest number is: " + secondLargest);

    }
    
}
