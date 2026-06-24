class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int c=target-numbers[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c)+1,i+1};
            }
            else{
                map.put(numbers[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
