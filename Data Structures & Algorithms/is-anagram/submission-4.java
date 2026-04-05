class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> counter = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
            counter.put(t.charAt(i), counter.getOrDefault(t.charAt(i), 0) - 1);
        }
        for(Character c : counter.keySet()) {
            if(!counter.get(c).equals(0)) {
                return false;
            }
        }
        return true;
    }
}
