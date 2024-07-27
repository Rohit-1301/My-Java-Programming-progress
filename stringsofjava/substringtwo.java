package stringsofjava;

public class substringtwo {
    public static void main(String[] args) {
        String str="Rohit";
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
