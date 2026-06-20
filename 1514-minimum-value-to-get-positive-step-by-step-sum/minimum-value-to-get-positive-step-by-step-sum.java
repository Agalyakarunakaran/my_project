class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int mins=0;
        for(int num:nums){
            sum+=num;
            mins=Math.min(mins,sum);
        }
        return 1-mins;
    }
}