import java.util.Stack;

public class TaskUtils {
    public static boolean isLineBalanced(String line){
        if(line.length() == 0) return true;
        if(line.length() % 2 != 0) return false;

        Stack<Character> clausesStack = new Stack<Character>();

        for (int i = 0; i < line.length(); i++) {
            char clause = line.charAt(i);
            switch (clause){
                case '(':
                case '[':
                case '{':
                    clausesStack.push(clause);
                    break;
                case ')':
                case ']':
                case '}':
                    if(!IsPeered(clausesStack, clause)) return false;
                    clausesStack.pop();
            }
        }
        return clausesStack.empty() ? true : false;
    }

    public static boolean IsPeered(Stack<Character> stack, char clause){
        if(stack.empty()) return false;
        switch (stack.peek()){
            case '[':
                return clause == ']' ? true : false;
            case '(':
                return clause == ')' ? true : false;
            case '{':
                return clause == '}' ? true : false;
            default:
                return false;
        }
    }

}


