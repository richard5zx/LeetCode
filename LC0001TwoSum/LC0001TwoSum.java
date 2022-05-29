class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
        // Solution 1
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i];
                
                if (nums[j] == complement) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
        **/
        
        // Solution 2
        Map<Integer, Integer> num_map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) { // Loop through num array
            int complement = target - nums[i]; // 
            
            if (num_map.containsKey(complement)) {
                return new int[] {num_map.get(complement), i};
            }   
            num_map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No Match Found");
    }
}