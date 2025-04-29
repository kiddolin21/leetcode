public String simplifyPath(String path) {
        String[] folders = path.split("/+");
        Deque<String> queue = new LinkedList<String>();
        
        for(String s : folders) {
            if(s.equals("..")) {
                if(!queue.isEmpty()) queue.pollLast();
            } else if(s.equals(".") || s.equals("")) continue;
            else queue.offer(s);
        }
        StringBuilder sb = new StringBuilder("");
        if(queue.isEmpty()) sb.append("/");
        while(!queue.isEmpty()) {
            sb.append("/").append(queue.poll());
        }
        return sb.toString();
    }
