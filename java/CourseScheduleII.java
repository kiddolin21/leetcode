public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            order[count++] = current;
            for (int i : map.get(current)) {
                if (--indegree[i] == 0) {
                    queue.offer(i);
                }
            }
        }
        return count == numCourses? order : new int[0];
    }
