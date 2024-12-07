import java.util.Stack;

public class MyStack {
  public static void main(String[] args) {
    
    // stack = LIFO data structure. Last-In First-Out
    //         Stores objects into a sort of "vertical tower"
    //         push() to add to the top
    //         pop() to remove from the top 

    Stack<String> stack = new Stack<String>();

    stack.push("Minecraft");
    stack.push("Skyrim");
    stack.push("DOOM");
    stack.push("Borderlands");
    stack.push("FFVII");

    String myFavGame = stack.pop();

    //System.out.println(stack.empty());

    System.err.println(stack.peek());
    System.out.println(stack.search("Mario Bros"));
    System.out.println(stack);
    System.out.println(myFavGame);

    // Uses of Stacks?
    // 1. undo/redo feactures in text editors
    // 2. moving back/forward through browser history 
    // 3. backtracking algorithms (maze, file directories)
    // 4. calling functions (call stacks)

  }
}
