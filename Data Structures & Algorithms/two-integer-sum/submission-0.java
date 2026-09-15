class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> el = new HashMap <>();

        int N = nums.length;

        for(int i = 0 ; i < N ; i ++){
            el.put(nums[i],i);
        }

        for(int j = 0 ; j < N ; j ++){
            int difference = target - nums[j];

            if(el.containsKey(difference) && el.get(difference) != j){
                
                return new int[]{j, el.get(difference)};
            }
        }
        
        return new int[]{};
    }
}