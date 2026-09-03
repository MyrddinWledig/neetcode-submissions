public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) 
    {
        var anagrams = new Dictionary<string, List<string>>();
        foreach(var str in strs)
        {
            int[] charFrequency = new int[26];
            foreach(char c in str)
            {
                charFrequency[c - 'a']++;
            }

            string key = string.Join(",", charFrequency);
            if(!anagrams.ContainsKey(key))
            {
                anagrams[key] = new List<string>();
            }
            anagrams[key].Add(str);
        }
        return anagrams.Values.ToList<List<string>>();
    }
}
