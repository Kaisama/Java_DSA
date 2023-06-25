package dsa.recursion.backtracking.assignment;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeQues22GenerateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solutionn {
    public List<String> generateParenthesis(int n) {
        //Approach: using Backtracking 
        List<String> ans = new ArrayList<>();
        backtrack("", n, n, ans);
        return ans;
    }
    public void backtrack(String s, int open, int close, List<String> ans){
        //base case
        if(open>close) return;
        if(open>0){
            backtrack(s+"(", open-1, close, ans);
        }
        if(close>0){
            backtrack(s+")", open, close-1, ans);
        }
        if(open==0 && close==0){
            ans.add(s);
        }
    }
}
