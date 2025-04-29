public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int start = 0;
        int max = 0;
        Map<Character, Integer> lastSeens = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
            Integer lastSeen = lastSeens.get(s.charAt(i));

            if (lastSeen != null)  {
                if (lastSeen >= start) {
                    max = Math.max(max, i - start);
                    start = lastSeen + 1;
                }
            }
            lastSeens.put(s.charAt(i), i);
        }
        max = Math.max(max, n - start);

        return max;
    }
