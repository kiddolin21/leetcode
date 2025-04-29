public List<List<Integer>> permute(int[] nums) {
        List<Integer> sorted = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        for(int num : nums) {
            left.add(num);
        }
        return locateNew(sorted, left);
    }
    
    private List locateNew(List<Integer> sorted, List<Integer> left) {
        List<List<Integer>> result = new ArrayList<>();
        if (left.size() == 0) {
            result = new ArrayList<>();
            result.add(sorted);
            return result;
        }
        for (int i = 0; i< left.size() ; i++) {
            List<Integer> newSort = new ArrayList<>(sorted);
            newSort.add(left.get(i));
            List<Integer> newLeft = new ArrayList<>(left);
            newLeft.remove(i);
            result.addAll(locateNew(newSort, newLeft));
        }
        return result;
    }
