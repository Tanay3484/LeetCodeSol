class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> frequencyMap = new HashMap<String,Integer>();
        HashSet<String> uniqueWrds = new HashSet<String>(Arrays.asList(words));
        for(String wrd : uniqueWrds){
            frequencyMap.put(wrd,0);
        }

        for(String wrd:words){
            frequencyMap.replace(wrd,frequencyMap.get(wrd)+1);
        }

        List<String> result = frequencyMap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry::getKey)).map(Map.Entry::getKey).limit(k).collect(Collectors.toList());

        return result;
        
    }
}