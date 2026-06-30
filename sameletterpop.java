import java.util.*;

public class sameletterpop {
    public static void main(String[] args) {
     String st="heqrsrrs";
     Stack <Character> stack=new Stack<>();
     for(int i=0;i<st.length();i++){
         char ch=st.charAt(i);
         if(!stack.isEmpty() && stack.peek()==ch ){
             stack.pop();
         }
         else{
             stack.push(ch);
         }
     }
     for(char e:stack){
         System.out.print(e);
     }
    }
}