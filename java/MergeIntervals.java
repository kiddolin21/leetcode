public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() < 2) return intervals;
        
        List<Interval> res = new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return Integer.compare(i1.start, i2.start);
            }
        });
        
        int s = intervals.get(0).start;
        int e = intervals.get(0).end;
        for(Interval i : intervals) {
            if(i.start > e) {
                res.add(new Interval(s, e));
                s = i.start;
                e = i.end;
            }
            else if(i.end > e) e = i.end;
        }
        res.add(new Interval(s,e));
        return res;
    }
