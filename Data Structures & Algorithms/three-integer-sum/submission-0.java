class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> throuples = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++)
        {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i], j = i+1, k = nums.length-1;
            while(j < k)
            {
                int sum = nums[j] + nums[k];
                if(sum < target)
                {
                    j++;
                }
                else if(sum > target)
                {
                    k--;
                }
                else
                {
                    throuples.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1])
                    {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }
        return throuples;
    }
}
