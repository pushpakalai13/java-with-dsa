public class linearsearch{
    public static void main(String[] args){
        int[] arr={4,6,2,5,8};
        int target=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print("found: "+i);
                return;
            }
        }
                System.out.print("Not found");
    }
}