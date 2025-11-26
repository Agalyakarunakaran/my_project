class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int a=0,b=0;
            for(int j=i;j<n;j++){
                if(s.charAt(j)=='0'){
                    a++;
                }
                else{
                    b++;
                }
                if(b<=k||a<=k){
                    count++;
                }
            }
        }
        return count;
    }
}