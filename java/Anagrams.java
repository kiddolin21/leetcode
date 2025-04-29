public List<String> anagrams(String[] strs) {
        List<String> res = new ArrayList<String>();
        Map<String,Integer>  map= new HashMap<String,Integer>();
        
        int index = 0;
        for(String s : strs) {
            String tmp = sort(s);
            if(!map.containsKey(tmp)) {
                map.put(tmp,index);
            }
            else {
                if(map.get(tmp)!=-1) {
                res.add(strs[map.get(tmp)]);
                map.put(tmp,-1);
                }
                res.add(s);
            }
            index++;
        }
        return res;
    }
    
    private String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
