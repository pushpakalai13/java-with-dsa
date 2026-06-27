import java.util.*;
public class twopointsorted {
    public static void main(String[] args) {
        int [] arr={5,8,7,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target=9;
        int left=0;
        int right=arr.length-1;
        while(left<right){
        int sum=arr[left]+arr[right];
        if(sum==target){
            System.out.println(left+" "+right);
           return;
        }
        else if(sum<target){
            left++;
        }
        else{
            right--;
        }
        }
        System.out.println(-1);
    }

  }