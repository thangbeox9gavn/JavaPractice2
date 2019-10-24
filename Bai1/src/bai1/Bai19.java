/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author hailo
 */
public class Bai19 {
    static String hauTo(String a){
        Stack st = new Stack();
        String n = "";
        for(int i = 0; i < a.length();i++){
            char c = a.charAt(i);
            if(c >= 'a' && c <= 'z'){
                n = n+c;
            }
            if( c == '+'|| c == '-' || c == '*' || c == '/' ){
                st.push(c);
            }
            if( c == ')'){
                char d = (char) st.pop();
                n = n+d;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
                
        String s  = sc.nextLine();
        while(t-- > 0){
            String a  = sc.nextLine();
            
            String b = hauTo(a);
            System.out.println(b);
        }
    }
}
