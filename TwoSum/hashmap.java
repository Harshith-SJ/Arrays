class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1st key 2nd index
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){  
           int diff=target-nums[i];
           if(map.containsKey(diff)){
            return new int[]{ map.get(diff),i };
           }
           else{
            map.put(nums[i],i);
           }
        }
    return null;
    }
}