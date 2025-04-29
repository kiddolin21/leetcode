public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        helper(res, s, "", 0);
        return res;
    }
    
    private void helper(List<String> res, String s, String tmp, int n) {
        if(n == 4) {
            if(s.length() == 0) res.add(tmp.substring(0, tmp.length() - 1));
            return;
        }
        
        for(int k = 1; k <= 3; k++) {
           if(s.length() < k) continue;
           int val = Integer.parseInt(s.substring(0, k));
           if(val > 255 || k != String.valueOf(val).length()) continue;
           helper(res, s.substring(k), tmp + s.substring(0,k)+".", n + 1);
        }
    }
