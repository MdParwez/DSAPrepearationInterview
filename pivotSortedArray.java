public class Solution {
    public int search(int[] nums, int target) {
     
    //as we got idea that we have to reach the time compleity of O(logn) then simple apply binary search 
    int low = 0;
    int high =  nums.length-1;

    while(low <=  high){
        int  mid  = (high + low)/2;
       
       if(nums[mid] == target)
       return  mid;

       if(nums[low] < nums[mid]){
         if(nums[low] <= target && target <=  nums[mid])
           high = mid-1;
           else
           low = mid+ 1;
       }
       else {
           if(nums[mid] <= target && target <= nums[high])
               low = mid +1;
               else
               high = mid-1; 
       }
    }
     return -1;
    }
 }
