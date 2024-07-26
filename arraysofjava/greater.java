package arraysofjava;

import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("to check from which no. we have to check the element in an array is greater");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]>x){
                count++;
            }
        }
        System.out.println("the no.of elments greater than "+x+" is "+count);
        System.out.println(a.length);
    }
}
