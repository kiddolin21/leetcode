 public int maxPoints(Point[] points) {
        if(points == null) return 0;
        int n = points.length;
        if(n < 3) return n;
        int count = 0;
        for(int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<Double, Integer>();
            int samep = 0, samex = 1;
            for(int j = 0; j < points.length; j++) {
                if(i != j) {
                    int p1x = points[i].x, p1y = points[i].y;
                    int p2x = points[j].x, p2y = points[j].y;
                    if(p1x == p2x && p1y == p2y) samep++;
                    if(p1x == p2x) {
                        samex++;
                        continue;
                    } else {
                        double k = (p1y - p2y) * 1.0 / (p1x - p2x);
                        if(map.containsKey(k)){
                            map.put(k, map.get(k) + 1);
                        }else {
                            map.put(k, 2);
                        }
                        count = Math.max(count, map.get(k) + samep);
                    }
                }
            }
            count = Math.max(count, samex);
        }
        return count;
    }
