// package twodarrayofjava;

// import java.util.Scanner;

// public class pascaltriangle {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no. of rows");
//         int n=sc.nextInt();
//         int a[][]=new int[n][];
//         for(int i=0;i<n;i++) {
//          //i row has i+1 colums
//          a[i]=new int[i+1];
//       // 1st and last element is 1;
//       a[i][0]=a[i][1]=1;
//       for(int j=1;j<i;j++) {
//          a[i][j]=a[i-1][j-1]+a[i-1][j];
//       }
//       System.out.println(a);
//     }
//     for(int i=0;i<n;i++) {
//   for(int j=0;j<=i;j++) {   
//    System.out.print(a[i][j]+" ");
//   }
//   System.out.println(" ");
// }
// }
// }



package twodarrayofjava;

import java.util.Scanner;

public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = triangle[i][i] = 1; // First and last element of each row is 1
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
