public class Solution {
    public bool IsAnagram(string s, string t) {
        char[] sArray = s.ToCharArray();
        char[] tArray = t.ToCharArray();
        Array.Sort(sArray);
        Array.Sort(tArray);
        
        if(sArray.Length != tArray.Length)
        {
            return false;
        }

        for(int i = 0; i < sArray.Length; i++)
        {
            if(sArray[i] != tArray[i])
            {
                return false;
            }
        }
        return true;
    }
}
