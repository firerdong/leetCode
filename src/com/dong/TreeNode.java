package com.dong;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
	int val;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode(int x) {
		val = x;
	}
	
	public static TreeNode getATreeNode() {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(5);
		TreeNode a6 = new TreeNode(6);
		TreeNode a7 = new TreeNode(7);
		TreeNode a8 = new TreeNode(8);
		
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right = a7;
		a4.left = a8;
		return a1;
	}
	
	public static void output(TreeNode t) {
		if(t != null) {
			System.out.print(t.val + "");
			output(t.left);
			output(t.right);
		}
	}
	
	public static void getMirrorTree(TreeNode t) {
		if(t == null) {
			return;
		}
		TreeNode tmp = t.left;
		t.left = t.right;
		t.right = tmp;
		getMirrorTree(t.left);
		getMirrorTree(t.right);
	}
	
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
	
	//101. Symmetric Tree
    //recursively
    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
        	return true;
        }
        getMirrorTree(root.right);
        
        return isSameTree(root.left, root.right);
    }
	//101. Symmetric Tree
    //iteratively
    public static boolean isSymmetric2(TreeNode root) {
        if(root == null){
        	return true;
        }
        
        Queue left = new LinkedList();
        Queue right = new LinkedList();
        
        left.add(root.left);
        right.add(root.right);
        
        while(! left.isEmpty() && !right.isEmpty()) {
        	TreeNode lNode = (TreeNode) left.poll();
        	TreeNode rNode = (TreeNode) right.poll();
			if (lNode == null && rNode == null) {
				continue;
			}
			if( (lNode == null && rNode != null) ||
					(lNode != null && rNode == null)) {
				return false;
			}
			if (lNode.val != rNode.val) {
				return false;
			}
			left.add(lNode.left);
			left.add(lNode.right);
			right.add(rNode.right);
			right.add(rNode.left);
        }
        
        return true;
    }
    
    public static int maxDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        
        int max = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        return max;
    }
    
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
        	return new ArrayList<List<Integer>>();
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        return fun(q);
        
    }
    
    private static List<List<Integer>> fun(Queue<TreeNode> q) {
    	if( q.size() <= 0 ) {
    		return null;
    	}
    	List<Integer> l = new ArrayList<Integer>();
    	Queue<TreeNode> subQ = new LinkedList<TreeNode>();
    	while(q.size() > 0){
    		TreeNode t = q.poll();
    		l.add(t.val);
    		if(t.left != null) {
    			subQ.offer(t.left);
    		}
    		if(t.right != null) {
    			subQ.offer(t.right);
    		}
    	}
			List<List<Integer>> ret = new LinkedList<List<Integer>>();
			ret.add(l);
			List<List<Integer>> sub = fun(subQ);
			if(sub != null) {
				ret.addAll(0, sub);
			}
			return ret;
    }

}
