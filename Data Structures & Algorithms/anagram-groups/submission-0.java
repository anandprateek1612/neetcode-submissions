class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            String sortedStr = Arrays.stream(strs[i].split("")).sorted().collect(Collectors.joining());
            if(map.containsKey(sortedStr)){
                List<String> getMapValueList = map.get(sortedStr);
                getMapValueList.add(str);
                map.put(sortedStr,getMapValueList);
            }
            else{
                map.put(sortedStr,new ArrayList<>(List.of(str)));
            }

        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            List<String> listOfGroupAnagrams = entry.getValue();
            res.add(listOfGroupAnagrams);
        }
        return res;
    }
}
