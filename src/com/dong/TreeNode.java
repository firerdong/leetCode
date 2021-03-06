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
		
//		a1.right = a2;
//		a2.right = a3;
		
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
		if (sub != null) {
			ret.addAll(0, sub);
		}
		return ret;
    }
    
    public static TreeNode sortedArrayToBST1(int[] nums) {
        if(nums.length == 0) {
        	return null;
        }
        
        TreeNode p = null;
        TreeNode root = new TreeNode(nums[0]);
        
        for(int i=1; i<nums.length; i++) {
        	p = root;
        	while(p != null) {
        		if(p.val < nums[i]) {
        			if(p.right != null) {
        				p = p.right;
        			}else{
        				p.right = new TreeNode(nums[i]);
        				break;
        			}
        		}else{
        			if(p.left != null) {
        				p = p.left;
        			} else {
        				p.left = new TreeNode(nums[i]);
        				break;
        			}
        		}
        	}
        }
        
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return null;
        }
        return helper(nums, 0, nums.length -1 );
    }
    
    private static TreeNode helper(int [] nums, int l, int r) {
    	if(l > r) {
    		return null;
    	}
    	int index = (l + r) /2;
    	TreeNode root = new TreeNode(nums[index]);
    	root.left = helper(nums, l, index -1);
    	root.right = helper(nums, index + 1, r);
    	return root;
    }
    
    public static boolean isBalanced(TreeNode root) {
        if(root == null) {
        	return true;
        }
        int diff = maxDepth(root.left) - maxDepth(root.right);
        if(diff > 1 || diff < -1) {
        	return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static boolean isBalanced2(TreeNode root) {
        if(root == null) {
        	return true;
        }
        return helper(root) == -1 ? false:true; 
    }
    private static int helper(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	int left = helper(root.left);
    	if(left == -1) {
    		return -1;
    	}
    	int right = helper(root.right);
    	if(right == -1) {
    		return -1;
    	}
    	int diff = left - right;
    	diff = diff>0? diff:0-diff;
    	if(diff <= 1) {
    		return Math.max(left, right) + 1; 
    	}else{
    		return -1;
    	}
    	
    }
    
    public static int minDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        int ret=0;
        if(left == 0 && right == 0) {
        	return 1;
        }
        if(left == 0) {
        	return right + 1;
        }
        if(right == 0) {
        	return left + 1;
        }
        return Math.min(left, right) + 1;
    }
    
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root.left == null && root.right == null) {
        	if(sum == root.val) {
        		return true;
        	} else{
        		return false;
        	}
        }
        
        int sub = sum - root.val;
        boolean left = false;
        if(root.left != null) {
        	left = hasPathSum(root.left, sub);
        }
        boolean right = false;
        if(root.right != null) {
        	right = hasPathSum(root.right, sub);
        }
        return left || right;
    }
}
