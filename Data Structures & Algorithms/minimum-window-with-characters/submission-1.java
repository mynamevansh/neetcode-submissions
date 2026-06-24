class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[126];
        if(s.length()<t.length())return "";
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0,right=0,start=0,minlen=Integer.MAX_VALUE,required=t.length();
        while(right<s.length()){
            char rchar=s.charAt(right);
            if(freq[rchar]>0){
                required--;
            }
            freq[rchar]--;
            right++;
            while(required==0){
                if(right-left<minlen){
                    minlen=right-left;
                    start=left;
                }
                char lchar=s.charAt(left);
                freq[lchar]++;
                if(freq[lchar]>0){
                    required++;
                }
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
