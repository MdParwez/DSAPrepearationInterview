class Solution{
    public int[] twoSum(int[] nums, int target){
       
    //we have to solve two sum problems using complment idea
      Map<Integer,Integer> map =  new HashMap<>();
       int n = nums.length;

       for(int i = 0; i < n; i++){
           int complement =  target-nums[i];
           if(map.containsKey(complement)){
               return new int[] {map.get(complement),i};
           }
           map.put(nums[i], i);
       }
       return new int[] {};
    }
}

// brute force approach for two sum problem 

//  simple run  two loops to get the results
/*
    for(int i = 0; i < nums.length; i++){
        for(int j = i+1; j < nums.length; j++){
            if(nums[i] + nums[j] == target){
                return new int[] {i,j};
            }
        }
    }
    return new  int[] {};
    }
}
*/
