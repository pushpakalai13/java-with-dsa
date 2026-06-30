import java.util.*;

public class stackletterpush {
    public static void main(String[] args) {
     String st="he(rs";
     Stack <Character> stack=new Stack<>();
     for(int i=0;i<st.length();i++){
         char ch=st.charAt(i);
         if(Character.isLetter(ch)){
             stack.push(ch);
         }
     }
     for(char e:stack){
         System.out.print(e);
     }
    }
}