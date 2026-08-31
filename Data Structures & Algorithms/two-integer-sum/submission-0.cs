public class Solution {
    public int[] TwoSum(int[] nums, int target) 
    {
        int augend = 0;
        int addend = 0;
        for(int i = 0; i < nums.Length-1; i++)
        {
            for(int j = i+1; j < nums.Length; j++)
            {
                int sum = nums[i] + nums[j];
                if(sum == target)
                {
                    augend = i;
                    addend = j;
                    break;
                }
            }
        }
        int[] answer = {augend, addend};
        return answer;
    }
}
