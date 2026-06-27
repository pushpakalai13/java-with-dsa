import java.util.*;
public class dupfind{
    public static void main(String[] args) {
        String s="madamx";
        int left=0;
        int right=s.length()-1;
        int i=0,j=0;
        while(left<right){
            if(s.charAt(right)==s.charAt(left)){
            left++;
            right--;
            }
        else{
         i=left+1;
        j=right;
        break;
        }
        }
        boolean found=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                found=false;
                break;
            }
            i++;
            j--;
        }
        if(found){
            System.out.print("remove extra characters: "+s.charAt(left));
        }
        else{
            System.out.print("remove the extra characters: "+s.charAt(right));
        }
        
}
}