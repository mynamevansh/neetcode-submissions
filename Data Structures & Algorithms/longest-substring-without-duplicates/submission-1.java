class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int left=0,right=0,maxlength=0;
        while(right<s.length()){
            char c=s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxlength=Math.max(maxlength,right-left+1);
            right++;
        }
        return maxlength;
    }
}
