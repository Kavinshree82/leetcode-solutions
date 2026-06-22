import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c:s.toCharArray())
        {
            // For an opening bracket, push its matching closing bracket
            if(c=='(')      st.push(')');
            else if(c=='{') st.push('}');
            else if(c=='[') st.push(']');
            else
            {
                if( st.isEmpty()||st.pop()!=c)
                {
                    return false;
                }
            }
        }
        // Valid only if all brackets have been matched
        return st.isEmpty();
    }
}