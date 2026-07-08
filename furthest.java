import java.util.*;
class furthest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={5,2,7,1,3,8,4};
        for(int i=0;i<arr.length;i++){
             int nextgretest=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    nextgretest=arr[j];
    
                }
            }
            System.out.println(arr[i]+ "->" +nextgretest);
        }

    }
}