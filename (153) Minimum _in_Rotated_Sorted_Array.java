//153. Find Minimum in Rotated Sorted Array
/*
# Intuition
Here we are iterating through all possible substrings of the string, 
counting the frequency of characters in each substring, and then
finding the difference between the maximum and minimum frequencies 
of characters in that substring.
# Approach
# 1. Beauty Function (beauty):
-->takes an array freq representing the frequency of characters in a substring.
-->It iterates through the freq array to find the minimum and maximum frequency of characters.
-->The difference between the maximum and minimum frequencies is returned and yes ignore it count is 0;
# 2. Beauty Sum Function (beautySum):
--> initializes ans to store the beauty sum.
-->It uses two nested loops to iterate through all possible substrings of the string:
-->The outer loop iterates over the starting index and inner loop   iterates over the ending index of the substring.
-->Inside the inner loop, a frequency array frequency is maintained to track the frequency of characters in the current substring.
-->beauty function :-- calculate the beauty value for the current substring.and then added to the ans variable.
-->The final ans value represents the beauty sum of all possible substrings.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n*n)$$
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(n)$$
*/
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
