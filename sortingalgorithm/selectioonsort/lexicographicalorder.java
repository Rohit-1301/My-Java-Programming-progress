package sortingalgorithm.selectioonsort;

import java.util.Scanner;

public class lexicographicalorder {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the length of a string");
     int n=sc.nextInt();
    String s[]=new String[n];
     for(int i=0;i<n;i++){
         s[i]=sc.next();
     }
     for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(s[i].compareTo(s[j])>0){
                 String temp=s[i];
                 s[i]=s[j];
                 s[j]=temp;
             }
         }
     }
     for(int i=0;i<n;i++){
         System.out.println(s[i]);
     }
 }
}
