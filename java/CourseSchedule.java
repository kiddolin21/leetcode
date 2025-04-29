public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses == 0 || prerequisites.length < 1) return true;
        int[] indegree = new int[numCourses];
        int cnt = numCourses;
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        for(int i = 0; i < prerequisites.length; i++)  {
               map.get(prerequisites[i][1]).add(prerequisites[i][0]);
               indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int i : map.get(current)) {
                if(--indegree[i] == 0) {
                    queue.offer(i);
                }
            }
            cnt--;
        }
        return cnt == 0;
    }
