class Solution {
    public int maxScore(String s) {
        int maxs=0;
        for(int i=1;i<s.length();i++){
            int zeros=0;
            int ones=0;
            for(int j=0;j<i;j++){
                if(s.charAt(j)=='0'){
                    zeros++;
                }
            }
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    ones++;
                }
            }
            maxs=Math.max(maxs,zeros+ones);
        }
        return maxs;
    }
}