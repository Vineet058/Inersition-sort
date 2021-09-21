// Insertion-Sort.
// This code is developed in BlueJ software.

import java.util.*;
class insertshot
{
    public static void main()
    {
         Scanner in = new Scanner(System.in);
         int a[]=new int[5];
         int i,c=0,j=0;
         System.out.println("Enter 5 random Number :");
         for (i=0;i<5;i++)
         {
             a[i]=in.nextInt();
         }
         System.out.print("You have entered this numbers :");
         for (i=0;i<5;i++)
         {
             System.out.print(a[i]);
         }
         System.out.println();
         for (i=0;i<5;i++)
         {
             c=a[i];
             j=i-1;
             while (j>=0 && c<a[j])
             {
                 a[j+1]=a[j];
                 j=j-1;
             }
             a[j+1]=c;
         }
         System.out.print("Asending order :");
         for (i=0;i<5;i++)
         {
             System.out.print(a[i]);
         }
         System.out.println();
         for (i=0;i<5;i++)
         {
             c=a[i];
             j=i-1;
             while (j>=0 && c>a[j])
             {
                 a[j+1]=a[j];
                 j=j-1;
             }
             a[j+1]=c;
         }
         System.out.print("Desending order :");
         for (i=0;i<5;i++)
         {
             System.out.print(a[i]);
         }
    }
}