public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root,sum,new ArrayList<Integer>(),res);
        return res;
    }
    
    private void helper(TreeNode root,int sum,List<Integer> list,List<List<Integer>> res) {
        if(root == null) 
            return;
            
        list.add(root.val);
        
        if(root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<Integer>(list));
        } else {
            helper(root.left,sum - root.val,list,res);
            helper(root.right,sum - root.val,list,res);
        }
        list.remove(list.size() - 1);
    }
