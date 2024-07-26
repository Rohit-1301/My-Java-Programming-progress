package arraysofjava;

public class fisrstarray {
    public static void main(String[] args) {
       int a[]={1,3,5,8,65,89,75,45,12,02,12,35,45,69,85,59,54,7,56};
       int sum=0;
       for(int i=0;i<a.length;i++){
         sum+=a[i];
}
       System.out.println(sum);
       int b=0;
       for(int i=0;i<a.length;i++){
   if(a[i]>b){
    b=a[i];
   }
       }
       System.out.println(b);
       int c=69;
       int d=0;
       for(int i=0;i<a.length;i++){
        if(a[i]==c){
            System.out.println(i);
            d++;
        }
      }
      if(d>=1){
        System.out.println(c);
      }
      else{
        System.out.println(-1);
      }
    }
}