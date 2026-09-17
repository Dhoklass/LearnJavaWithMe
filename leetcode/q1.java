class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        return result; // won't reach here per problem constraints
    }
}

class q1{
    public static void main(String[] args){
        Solution s1 = new Solution();
        int [] sum = {3, 6 ,10, 8};
        int target = 9;
        int[] answer = s1.twoSum(sum, target);
        System.out.println(answer[0] + answer[1]);

    }
}