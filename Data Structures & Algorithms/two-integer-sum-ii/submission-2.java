class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int i = 0;
        int j = numbers.length-1;
        boolean found = false;
        while(!found)
        {
            int sum = numbers[i] + numbers[j];
            if(sum > target)
            {
                j--;
            }
            else if(sum < target)
            {
                i++;
            }
            else
            {
                found = true;
            }
        }
        int[] result = {i+1, j+1};
        return result;
    }
}
