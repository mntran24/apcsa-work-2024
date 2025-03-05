import java.util.EmptyStackException;
import java.util.Stack;

public class StackCalculator{
    public static void main(String[] args){
        // System.out.println(eval("3 4 + 2 * 7 /"));
        // System.out.println(infixToPostfix("10 + 8 * 4"));
        System.out.println(eval(infixToPostfix("10 + 8 * 4")));
    }
    public static double eval(String expression) throws IllegalArgumentException{
        String[] arg = expression.split(" ");
        Stack<Double> calc = new Stack<Double>();
        try{
            for(int i = 0;i<arg.length;i++){
                if(isNum(arg[i])){
                    calc.push(Double.parseDouble(arg[i]));
                }
                else{
                    if(arg[i].equals("+")){
                        calc.push(calc.pop()+calc.pop());
                    }
                    else{
                        if(arg[i].equals("-")){
                            double temp = calc.pop();
                            calc.push(calc.pop()-temp);
                        }
                        else{
                            if(arg[i].equals("*")){
                                calc.push(calc.pop()*calc.pop());
                            }
                            else{
                                if(arg[i].equals("/")){
                                    double temp = calc.pop();
                                    calc.push(calc.pop()/temp);
                                }
                                else{
                                    if(arg[i].equals("%")){
                                        double temp = calc.pop();
                                        calc.push(calc.pop()+temp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(calc.size()>1){
                throw new IllegalArgumentException();
            }
            return calc.pop();
        }
        catch(EmptyStackException e){
            throw new IllegalArgumentException();
        }

    }
    public static String infixToPostfix(String infix){
        Stack<String> operator = new Stack<String>();
        String post = "";
        String[] expression = infix.split(" ");
        for(int i = 0;i<expression.length;i++){
            if(isNum(expression[i])){
                post+=expression[i]+" ";
            }
            else{
                if(operator.empty()){
                    operator.push(expression[i]);
                }
                else{
                    if(expression[i].equals(")")){
                        while(!operator.peek().equals("(")){
                            post+=operator.pop()+" ";
                        }
                        operator.pop();
                    }
                    else{
                        if(operator.peek().equals("(")||operator.peek().equals(")")){
                            operator.push(expression[i]);
                        }
                        else{
                            int topPriority = (operator.peek().equals("+")||operator.peek().equals("-")||operator.peek().equals("("))?0:1;
                            int currPriority = (expression[i].equals("+")||expression[i].equals("-"))?0:1;
                            if(topPriority>currPriority){
                                post+=operator.pop()+" ";
                                operator.push(expression[i]);
                            }
                            else{
                                operator.push(expression[i]);
                            }
                        }
                    }
                }
            }
        }
        while(!operator.empty()){
            post+=operator.pop()+" ";
        }
        return post.substring(0,post.length()-1);
    }
    public static boolean isNum(String num){
        try{
            Double.parseDouble(num);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}