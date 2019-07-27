class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstNum = 0;
        int secondNum = 0;
        int sum = 0;
        int location1 = 0;
        int location2 = 0;
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            firstNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                secondNum = nums[j];
                if (firstNum+secondNum == target) {
                    location1 = i;
                    location2 = j;
                }
            }
        }
        answer[0] = location1;
        answer[1] = location2;
        return answer;
    }
}