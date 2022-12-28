33.Search in Rotated Sorted Array




# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Stand in the position and try to find a side that is sorted 
# Approach
<!-- Describe your approach to solving the problem. -->
now as u got a side that is sorted see if the that can have the target element 

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
as we have us just binary Search soo it is O(ln n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
O(1)
# Code
```
class Solution {

    public int search(int[] nums, int target) {
        int ll=0,ul=nums.length-1,mid;

        while(ll<=ul){
            mid=ll+(ul-ll)/2;

            if(nums[mid]==target){
                return mid;
            }
        //Try if the right side is sorted 
            else if(nums[mid]>=nums[ll]){
        //Lets see if the sorted side can have the target number
        // if yes than search in that else search in other side
               if(target>=nums[ll] && target<nums[mid]){
                   ul=mid-1;
               }
               else{
                   ll=mid+1;
               }
            }
//Check that other side as it must be sorted 
            else{
                if(target>=nums[mid] && target<=nums[ul]){
                   ll=mid+1;
               }
               else{
                   ul=mid-1;
               }
            }

        }
    return -1;
    }
}
```
