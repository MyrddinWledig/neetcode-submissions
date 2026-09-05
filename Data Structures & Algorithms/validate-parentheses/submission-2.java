class Solution {
    public boolean isValid(String s) 
    {
        char[] c = s.toCharArray();
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        for(int i = 0; i < c.length; i++)
        {
           if(bracketPairs.containsKey(c[i]))
           {
            if(!brackets.isEmpty() && brackets.peek() == bracketPairs.get(c[i]))
            {
                brackets.pop();
            }
            else
            {
                return false;
            }
           }
           else
           {
            brackets.push(c[i]);
           }
        }
        return brackets.isEmpty();
    }
}
