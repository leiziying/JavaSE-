import jdk.nashorn.internal.runtime.StoredScript;

import java.util.ArrayList;
import java.util.Stack;

/*
括号匹配问题：
 遍历字符串中的每个字符
    如果是左括号：入栈
    如果是右括号：
           如果栈是空的：不匹配（右括号多了）  }}}}
           出栈
           如果左右括号不匹配：不匹配  （} （}
           否则继续循环
如果栈不为空：不匹配（左括号多）{{{{
否则匹配
遍历字符串：
boolean isValid(String s){
for(int i=0;i<s.length;i++){
  char c=s.charAt(i);
  }
}
 */
public class SolutionDemo {
    public boolean  isValid(String  s){
        ArrayList<Character>  stack=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch (c){
                //凡是左括号就入栈
                case '(':
                case'[':
                case'{':
                    stack.add(c);
                    break;
                case')':
                case']':
                case'}':{
                    if(stack.isEmpty()){
                        return false;
                    }

                    char left=stack.remove(stack.size()-1);
                    //left左括号，c是右括号
                    if(!((left=='('&&c==')')||(left=='['&&c==']')||(left=='{'&&c=='}'))){
                        return false;
                    }
                    break;
                }
                default:
                    break;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
