package classandobject.exceptionhandling;

import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        boolean flag=true;
       
         
           
           
                try{
                    while(flag){
                    System.out.println("enter the first number");
                    int a=sc.nextInt();
                    System.out.println("enter the second number");
                    int b=sc.nextInt();
                    System.out.println("enter the operation which u want to perform");
                    String s=sc.next();
                    if(s.equals("+")){
                        System.out.println(a+b);
                    }
                    else if(s.equals("-")){
                        System.out.println(a-b);
                    }
                    else if(s.equals("*")){
                        System.out.println(a*b);
                    }
                    else if(s.equals("/")){
                        System.out.println(a/b);
                    }
                    else{
                        System.out.println("invalid operation");
                    }
                    flag=false;
                
            }
        }
                catch(Exception e){
                    System.out.println("program doesn't run due to exception . Reason :"+e);
                }
            
            System.out.println("thank you");
        }
     
    }

