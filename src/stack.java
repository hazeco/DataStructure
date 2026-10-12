import java.util.Stack;

public class stack{
    public static void main(String[] args){
        
        Stack<String> stack = new Stack<String>();

        
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Warframe");
        stack.push("DOOM");
        stack.push("FFVII");

        //String myFavGame = stack.pop();
        //System.out.println(stack.peek());
        //System.out.println(stack.search("FFVII"));
        
        for(int i = 0; i < 1000000000 ; i++){
            stack.push("Fallout76");
        }

        System.out.println(stack);
        //System.out.println(myFavGame);
    }
}
