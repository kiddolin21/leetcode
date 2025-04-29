public String simplifyPath(String path) {
        String[] paths = path.split("/+");
        Deque<String> queue = new LinkedList<String>();
        
        for(String s: paths) {
            if(s.equals("..")) {
                if(!queue.isEmpty())
                    queue.pollLast();
            }
            else if(s.equals(".")) continue;
            else queue.offer(s);
        }
        
        StringBuilder result = new StringBuilder("");
        if(queue.isEmpty()) result.append("/");
        while(!queue.isEmpty()) {
            result.append("/").append(queue.poll());
        }
        return result.toString();
    }
