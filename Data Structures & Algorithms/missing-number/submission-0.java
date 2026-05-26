class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int xor2=0;
        for(int num:nums){
            xor1^=num;
        }
        for(int i=1;i<=nums.length;i++){
            xor2^=i;
        }
        return xor1^xor2;
    }
}
