package demo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BrokenKeyboard {
    public static void mian(String[] args){
        Scanner  scanner=new Scanner(System.in);
        String right=scanner.nextLine();
        String wrong=scanner.nextLine();
        //先把所有的坏掉的转换到一个set中
        Set<Character> set=new TreeSet<>();
        for(char c:wrong.toCharArray()){
            set.add(c);
        }

        Set<Character>  written=new TreeSet<>();
         for(char c:right.toCharArray()){
            if(!set.contains(c)){
                if(c>='a'&&c<='z'){
                    c+=('A'-'a');
                }
                if(!written.contains(c)){
                    System.out.print(c);
                    written.add(c);
                }
            }
        }
    }
}
