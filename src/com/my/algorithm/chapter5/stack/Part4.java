package com.my.algorithm.chapter5.stack;

import java.util.Scanner;
import java.util.Stack;
/**

 4. 후위식 연산(postfix)
 설명

 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.


 입력
 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.

 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.


 출력
 연산한 결과를 출력합니다.


 예시 입력
 352+*9-

 예시 출력
 12

 */
public class Part4 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        char[] chars = kb.next().toCharArray();

        Stack<String> stack = new Stack();

        for(int i = 0; i < chars.length; i++){
            if(48 <= chars[i] && chars[i] <= 57){
                stack.push(String.valueOf(chars[i]));
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (chars[i]){
                    case '+': b+=a; break;
                    case '-': b-=a; break;
                    case '*': b*=a; break;
                    case '/': b/=a; break;
                }
                stack.push(String.valueOf(b));
            }
        }

        System.out.println(stack.pop());
        return;
    }

}