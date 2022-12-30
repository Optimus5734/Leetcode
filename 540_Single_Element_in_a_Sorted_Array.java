# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
1.**Pair Check** as we know the number must be in pairs or single
  so if [1,1,2,2,3,3,4,5,5] is the array then 1st index     always will be a even and 2nd index always will be a odd if the unique element is not present before
if unique element is present before that then 1st index of the pair will be a odd and 2nd will even 

2.so we can partition it by this method  

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
Binary Search O(lgn)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
O(1)
# Code
```
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,h=nums.length-1,mid;
        if(nums.length==1){
            return nums[0];
        }

        while(l<=h){
            
            mid=l+(h-l)/2;

            if(mid==0){
                if(nums[mid]!=nums[mid+1])
                    return nums[mid];
            }
            else if(mid==nums.length-1){
                if(nums[mid]!=nums[mid-1])
                    return nums[mid];
            }
         else if( nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){              
                return nums[mid];
            }
        else if(nums[mid]==nums[mid-1]){
            if((mid&1)==0){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        else {
            if(((mid+1)&1)==0){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        }
return -1;
    }
}
```
