package sortingalgorithm.selectioonsort;

public class min {
    static void selectionsort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
              if(a[j]<min_index){
                min_index=j;
              } 
             }
          int temp=a[i];
          a[i]=a[min_index];
          a[min_index]=temp;
        }
        }
    public static void main(String[] args) {
        
        int a[]={1,98,23,15,45,10,0,21,65,412,3};
         selectionsort(a);

            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
    }

