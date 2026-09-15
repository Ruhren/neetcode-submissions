class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        

        for(int i = 0 ; i < strs.length ; i ++){

            int[] count = new int[26];
            Arrays.fill(count, 0);
            for(int j = 0 ; j < strs[i].length(); j ++) {

                char[] chars = strs[i].toCharArray();

                count[chars[j] - 'a']++;
            }

            String counts = Arrays.toString(count);

            if(map.containsKey(counts)){
                map.get(counts).add(strs[i]);
            }else{
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                map.put(counts , group);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}
