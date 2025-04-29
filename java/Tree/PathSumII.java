public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        pathSumHelper(root, sum, res, new ArrayList<Integer>());
        return res;
    }
    
    private void pathSumHelper(TreeNode root, int sum, List<List<Integer>> res, List<Integer> list) {
        if(root == null) return;
        
        list.add(root.val);
        if(root.left == null && root.right == null && root.val == sum)
            res.add(new ArrayList<Integer>(list));
        else {
            pathSumHelper(root.left, sum - root.val, res, list);
            pathSumHelper(root.right, sum - root.val, res, list);
        }
        list.remove(list.size() - 1);
    }
