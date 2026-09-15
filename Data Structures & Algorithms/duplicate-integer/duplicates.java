class Solution {
    public boolean hasDuplicate(int[] nums) {

        Boolean hasDup = false;

        Map<Integer, Integer> el = new HashMap<>();
        int N = nums.length;

        for(int i = 0 ; i < N ; i ++ ){

            if(el.containsKey(nums[i])){
                return true;
            }else{
                el.put(nums[i], 0);

            }
        }

        return false;

        
    }
}
