class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        for(int num:nums){
            arr[num]=true;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=true){
                return i;
            }
        }
        return -1;
    }
}
