#better approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i = 0 ; i<nums.length;i++){
        int sum=0;
            for(int j = i ; j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}


#best approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int prefixSum=0;
        int diff=0;
        map.put(0,1);
        for(int i = 0 ; i<nums.length;i++){
            prefixSum=prefixSum+nums[i];
            diff=prefixSum-k;
            if(map.containsKey(diff)){
                count=count+map.get(diff);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
     return count;
    }
}
