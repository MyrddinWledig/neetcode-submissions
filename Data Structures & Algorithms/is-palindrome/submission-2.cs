public class Solution {
    bool isAlphaNum(char c)
    {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || (c >= '0' && c <= '9'));
    }

    public bool IsPalindrome(string s) 
    {
        s = s.ToLower();
        int i = 0;
        int j = s.Length-1;
        while(i < j)
        {
            while(!isAlphaNum(s[i]) && i < j)
            {
                i++;
            }

            while(!isAlphaNum(s[j]) && i < j)
            {
                j--;
            }

            if(s[i] != s[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
