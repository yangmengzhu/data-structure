import java.util.Stack;

public class Demo3 {
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    System.out.println("右括号多");
                    return false;
                }else{
                    char ch1=stack.peek();
                    if(ch=='('&&ch1==')' || ch=='['&&ch1==']' || ch=='{'&&ch1=='}'){
                        stack.pop();
                    }else{
                        System.out.println("左右括号不匹配");
                        return false;
                    }
                }
            }
        }
        if(!stack.empty()){
            System.out.println("左括号多");
            return false;
        }
        return true;
    }

}
