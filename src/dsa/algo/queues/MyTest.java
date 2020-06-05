package dsa.algo.queues;

import com.sun.jdi.ObjectReference;
import dsa.algo.stack.Stack;

public class MyTest {
    public Stack stack2 ;
    private String operators = "/*-+%";
    MyTest(){
       stack2 = new Stack();
    }

    public void calStack(String expression){
        String[] expressionArr = expression.split("");
        for(String exp: expressionArr){
            if(operators.contains(exp)){
                operatorCal(exp);
            }else{
                stack2.push(exp);
            }
        }

    }

    public void operatorCal(String exp){
        if(stack2.stackLen()<2){
            return;
        }
        int pop1 =  Integer.valueOf((String)stack2.pop());
        int pop2 = Integer.valueOf((String)stack2.pop());
        if(exp == "/") {int value = pop2/pop1;
            stack2.push(String.valueOf(value));
        }
        if(exp.equals("*")){int value = pop2*pop1;
            stack2.push((String.valueOf(value)));
        }
        if(exp == "%") {int value = pop2%pop1;
            stack2.push(String.valueOf(value));
        }
        if(exp == "-") {int value = pop2-pop1;
            stack2.push(String.valueOf(value));
        }
        if(exp.equals("+")) {
            int value = pop2 + pop1;
            stack2.push(String.valueOf(value));
        }
    }

    public static void main(String[] args) {
        MyTest test = new MyTest();
        test.calStack("54*62/+78*-");
//        System.out.println(test.stack2.pop());
        test.stack2.displayStack();
    }
}
