import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        while(T-->0) {
            Stack<Character> stack = new Stack<>();
            String line = sc.nextLine();
            
            for(char c : line.toCharArray()){
                if(c == '(') {
                    stack.push(c);
                }else if(c == ')') {
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }else {
                        stack.push(c);
                    }
                }
            }
            System.out.println(stack.isEmpty() ? "YES" : "NO");
        }
        }
}