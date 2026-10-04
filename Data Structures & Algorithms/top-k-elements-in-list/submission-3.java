class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<Integer>[] bucketList=new List[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucketList[freq]==null){
                bucketList[freq]=new ArrayList<>();
            }
            bucketList[freq].add(key);
        }

        int[] result=new int[k];
        int index=0;
        for(int i=bucketList.length-1;i>=1;i--){
            if(bucketList[i]!=null){
                for(int num:bucketList[i]){
                    result[index++]=num;
                }
                if(index==k){
                    return result;
                }
            }
        }

        return result;
    }
}
