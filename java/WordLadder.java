public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();
        queue.add(beginWord);
        queue.add(null);
        visited.add(beginWord);
        int level = 1;
        
        while(!queue.isEmpty()) {
            String str = queue.poll();
            
            if(str != null) {
                for(int i=0;i<str.length();i++) {
                    char[] chars = str.toCharArray();
                    for(char c='a';c<='z';c++) {
                        chars[i] = c;
                        
                        String word = new String(chars);
                        if(word.equals(endWord)) return level + 1;
                        
                        if(wordDict.contains(word) && !visited.contains(word)) {
                            queue.add(word);
                            visited.add(word);
                        }
                    }   
                }
            } else {
                level ++;
                if(!queue.isEmpty()) queue.add(null);
            }
            
        }
        return 0;
    }
