class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder encoded = new StringBuilder();
        for(String str : strs)
        {
            encoded.append(str.length() + "#" + str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) 
    {
        ArrayList<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length())
        {
            int j = i;
            while(str.charAt(j) != '#')
            {
                j++;
            }
            int strLen = Integer.parseInt(str.substring(i, j));
            i = j+1;
            decoded.add(str.substring(i, i + strLen));
            i += strLen;
        }
        return decoded;
    }
}
