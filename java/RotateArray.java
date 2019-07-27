class Solution {
     public void rotate(int[] nums, int k) {
            int temp = 0;
            int temp2 = 0;
            int counter = 0;
            

            for (int i = 0; i < nums.length; i++) {
                
                if (i == 0) {
                    temp = nums[k*(i+1) % nums.length];
                    nums[k*(i+1) % nums.length] = nums[i];
                } else { 
                    
                    temp2 = temp;
                    if (k*(i+1) % nums.length == 0) {
                            temp = nums[(k*(i+1) % nums.length) + counter + 1];
                            nums[(k*(i+1) % nums.length) + counter] = temp2;
                            counter++;
                    } else {
                        temp = nums[(k*(i+1) % nums.length) + counter];
                        nums[(k*(i+1) % nums.length) + counter] = temp2;
                        
                    }
                }
            }
    }
}