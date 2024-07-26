package arraysofjava;

import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of a string");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}
        for(int i=0;i<n;i++){
            System.out.println(a[i]);}
        System.out.println("ENter element which you want to check");
        int element=sc.nextInt();
        int present=0;
        for(int i=0;i<n;i++){
            if(a[i]==element){
            present++;
            }}
        System.out.println(element+ " is  present "+present+" times");
        for(int i=n-1;i>0;i--){
            if(a[i]==element){
            present++;
            System.out.println("the given element last time present is on  "+i+" th ones");
            break;
            }}
        if(present>0){
            System.out.println("the given element is present");
        }
        else{
            System.out.println("it is not present");
        }
    }
}
