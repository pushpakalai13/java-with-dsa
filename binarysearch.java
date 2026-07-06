import java.util.*;
public class binarysearch{
    public static void main(String[] args){
        int[] arr={4,6,2,5,3,8};
        int target=5;
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<=high){
             int mid=(high+low)/2;
            if(arr[mid]==target){
                System.out.print("found at: "+mid);
                return;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
             high=mid-1;
            }
        }
        System.out.print("not found");
         }
          }
    