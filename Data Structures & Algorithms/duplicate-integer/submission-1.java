class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> valueCounter = new HashSet<>();
        for(int n : nums) {
            if(valueCounter.contains(n)) {
                return true;
            } else {
                valueCounter.add(n);
            }
        }
        return false;
    }
}