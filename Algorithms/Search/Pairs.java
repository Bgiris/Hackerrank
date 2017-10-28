/** Hackerrank practice questions
* Pairs
* https://www.hackerrank.com/challenges/pairs/problem
*
* @author	Berkay Giris
* @date		29.10.2017
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pairs {
    static int pairs(int[] a,int k) {
        HashMap<Integer, Boolean> x = new HashMap<Integer, Boolean>();
        int result = 0;
        for(Integer number : a){
            x.put(number, true);
        }
        
        for(Integer number : a){
            if(x.containsKey(number+k)){
                result++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,_k);
        System.out.println(res);
    }
}
