package arraysofjava;
import java.util.Scanner;
public class abc {
    




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        int j=0;
        for(int i=n-1;i>=0;i--){
            {
                a[j++]=a[i];
                System.out.println(a[i]+" ");
            }
           
        }
    }
}


