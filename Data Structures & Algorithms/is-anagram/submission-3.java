class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> counter = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            counter.computeIfAbsent(s.charAt(i), k -> 0);
            counter.computeIfPresent(s.charAt(i), (k, v) -> v + 1);
            counter.computeIfAbsent(t.charAt(i), k -> 0);
            counter.computeIfPresent(t.charAt(i), (k, v) -> v - 1);
        }
        for(Character c : counter.keySet()) {
            if(!counter.get(c).equals(0)) {
                return false;
            }
        }
        return true;
    }
}
