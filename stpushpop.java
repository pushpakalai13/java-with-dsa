import java.util.*;
class stpushpop {
    public static void main(String[] args) {
        int[] pushed={1,2,3,4,5};
        int[] poped={4,5,3,2,1};
        int index=0;
        Stack <Integer> stack=new Stack<>();
        while(!stack.isEmpty()){
        for(int i=0;i<5;i++){
            stack.push(pushed[i]);
            if(stack.peek()==poped[index]){
                stack.pop();
                index++;
            }
        }
        for(int i=0;i<5;i++){
            if(stack.peek()==poped[index]){
                stack.pop();
                index++;
            }
        }
        }
        if(stack.isEmpty()){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}