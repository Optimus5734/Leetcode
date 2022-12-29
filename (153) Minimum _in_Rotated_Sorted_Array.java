153. Find Minimum in Rotated Sorted Array




# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
the point that is minimum must have 2 criteria 1 it must be smaller from both inedx+1 and index-1 Thats what we are searching find a mid and see if it is smaller than mid-1 that means we are in position where rotatio have occur
if mid+1 is smaller than mid then mid +1 is the space for rotation
# Approach
<!-- Describe your approach to solving the problem. -->
if not that remove the 1 side of the sorted array
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(lgn)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
O(1)
# Code
```
class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1,mid,ans=Integer.MAX_VALUE;
       //Say the array is not sorted
        if(nums[l]<=nums[h]){
            return nums[l];
        }
        while(l<=h){
            mid = l + (h-l)/2;

            if(nums[mid]>nums[mid+1])
                return nums[mid+1];

            else if(nums[mid]<nums[mid-1])
                return nums[mid];   
            
            else if(nums[mid]>=nums[l])
                l=mid+1;

            else
                h=mid-1;
        }
        return -1;
    }
}
