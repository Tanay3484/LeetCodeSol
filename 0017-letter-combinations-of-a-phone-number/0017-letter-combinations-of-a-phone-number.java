class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()||digits==null) return Collections.emptyList();
        HashMap<Integer,HashSet<Character>> map = new HashMap<Integer,HashSet<Character>>();
        map.put(2, new HashSet<>(Arrays.asList('a', 'b', 'c')));
        map.put(3, new HashSet<>(Arrays.asList('d', 'e', 'f')));
        map.put(4, new HashSet<>(Arrays.asList('g', 'h', 'i')));
        map.put(5, new HashSet<>(Arrays.asList('j', 'k', 'l')));
        map.put(6, new HashSet<>(Arrays.asList('m', 'n', 'o')));
        map.put(7, new HashSet<>(Arrays.asList('p', 'q', 'r', 's')));
        map.put(8, new HashSet<>(Arrays.asList('t', 'u', 'v')));
        map.put(9, new HashSet<>(Arrays.asList('w', 'x', 'y', 'z')));

        List<String> result = new ArrayList<String>();
        letterCombinationsRecursive(map,digits,0,new StringBuilder(),result);
        return result;
    }

    public void letterCombinationsRecursive(Map<Integer,HashSet<Character>> keypadMap, String digits, int index, StringBuilder current, List<String> result){
        if(index==digits.length()){
            result.add(current.toString());
            return ;
        }

        int digit = Character.getNumericValue(digits.charAt(index));
        HashSet<Character> characters = keypadMap.get(digit);

        if(characters!=null){
            for(char c:characters){
                current.append(c);
                letterCombinationsRecursive(keypadMap,digits,index+1,current,result);
                current.deleteCharAt(current.length()-1);
            }
        }
    }
}