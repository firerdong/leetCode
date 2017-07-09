package com.dong;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null) {
            return q==null?true:false;
        }
        if(q == null) {
            return p==null?true:false;
        }
        if(p.val == q.val){
            return true&&isSameTree(p.left, q.left)&&isSameTree(p.right,q.right);
        }else{
            return false;
        }
    }
}
