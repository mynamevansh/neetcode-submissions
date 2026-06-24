class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            int[] freq=new int[26];
            for(char c:str.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder keybuilder=new StringBuilder();
            for(int i=0;i<26;i++){
                keybuilder.append('#');
                keybuilder.append(freq[i]);
            }
            String key=keybuilder.toString();
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
