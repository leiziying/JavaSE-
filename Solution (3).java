package demo02;

import java.util.Stack;

/*
给定一个只包括（  ，） ， {  ，}  ，[  ,]的字符串，判断字符串是否有效
有效字符串要求：
  左括号必须用相同类型的右括号闭合
  左括号必须以正确的顺序闭合
  注意空字符串可被认为是有效字符串
 */
//用栈实现
/*
左括号入栈
右括号匹配，如果匹配则弹出
 */
public class Solution {
    public  boolean  isValid(String  s){
        //str ->  char[]  字符串变成数组
        char[]  data=s.toCharArray();
        Stack<Character>   stack=new Stack<>();
        for(char  c:data){
            //碰到左括号入栈
            if(c=='{'||c=='['||c=='('){
                stack.push(c);//左括号入栈
            }else{
                if(stack.isEmpty()) {
                    //判断栈是否为空，如果为空返回false;
                    return false;
                }//否则说明栈里有东西，取出栈顶元素匹配
                else if(c=='}'){
                    char  temp=stack.peek();//取出栈顶元素
                    if(temp=='{'){
                        stack.pop();
                        continue;
                    }else{
                        return false;
                    }
                }else  if(c==']'){
                    char temp=stack.peek();
                    if(temp=='['){
                        stack.pop();
                        continue;
                    }else{
                        return false;
                    }
                }else if(c==')'){
                    char temp=stack.peek();
                    if(temp=='('){
                        stack.pop();
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return  true;
        }else{
            return  false;
        }
    }
}
