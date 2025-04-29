public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length < 1) return res;
        Arrays.sort(strs);
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted)) map.get(sorted).add(s);
            else {
                List<String> list = new ArrayList<String>();
                list.add(s);
                map.put(sorted, list);
            }
        }
        for(List<String> list :  map.values()) 
            res.add(list);
        return res;
    }
