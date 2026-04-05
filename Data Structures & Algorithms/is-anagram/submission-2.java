class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> firstCounter = new HashMap<>();
        Map<Character, Integer> secondCounter = new HashMap<>();
        for(Character c : s.toCharArray()) {
            firstCounter.merge(c, 1, Integer::sum);
        }
        for(Character c : t.toCharArray()) {
            secondCounter.merge(c, 1, Integer::sum);
            if(firstCounter.get(c) == null || 
                secondCounter.get(c) > firstCounter.get(c)) {
                return false;
            }
        }
        if(firstCounter.size() != secondCounter.size()) {
            return false;
        }
        for(Character c : firstCounter.keySet()) {
            if(secondCounter.get(c) == null || 
                !secondCounter.get(c).equals(firstCounter.get(c))) {
                return false;
            }
        }
        return true;
    }
}
