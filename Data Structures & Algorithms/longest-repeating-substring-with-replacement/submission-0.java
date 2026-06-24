class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxfreq=0,result=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            while((right-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            result=Math.max(result,right-left+1);
        }
        return result;
    }
}
