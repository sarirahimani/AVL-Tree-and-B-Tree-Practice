package assignment3;

public class AVLTree {
	AVLNode root;
	
	
	
	public int getHeight(AVLNode node) {
		if(node==null) {
			return -1;
		}else {
			return node.height;
		}
	}
	
	public boolean add(int num) {
		root=add(root,num);
		return true;
	}
	public AVLNode add(AVLNode node, int num) {
		if(node==null) {
			return new AVLNode(num);
		}if(num<node.value) {
			node.left=add(node.getLeft(),num);
		}else {
			node.right=add(node.getRight(),num);
		}
		int lHeight=getHeight(node.getLeft());
		int rHeight=getHeight(node.getRight());
		
		if(Math.abs(lHeight-rHeight)==2) {
			return balance(node);
		}else {
			node.resHeight();
			return node;
		}
	}
	public AVLNode balance(AVLNode node) {
		int rHeight=getHeight(node.getRight());
		int lHeight=getHeight(node.getLeft());
		if(rHeight>lHeight) {
			AVLNode rChild = node.getRight();
			int rrHeight = getHeight(rChild.getRight());
			int rlHeight = getHeight(rChild.getLeft());
			if(rrHeight>rlHeight) {
				return rrBalance(node);
			}else {
				return rlBalance(node);
			}
		}else {
			AVLNode lChild = node.getLeft();
			int llHeight = getHeight(lChild.getLeft());
			int lrHeight = getHeight(lChild.getRight());
			if (llHeight > lrHeight) {
				return llBalance(node);
			}else {
				return lrBalance(node);
			}
		}
	
	}
	private AVLNode lrBalance(AVLNode node) {
		AVLNode root = node;
		AVLNode lNode = root.getLeft();
		AVLNode lrNode = lNode.getRight();
		AVLNode lrlTree = lrNode.getLeft();
		AVLNode lrrTree = lrNode.getRight();
		lNode.right = lrlTree;
		root.left = lrrTree;
		lrNode.left = lNode;
		lrNode.right = root;	
		lNode.resHeight();
		root.resHeight();
		lrNode.resHeight();
		return lrNode;
	}
	private AVLNode llBalance(AVLNode node) {
		
		AVLNode lChild = node.getLeft();
		AVLNode lrTree = lChild.getRight();
		lChild.right = node;
		node.left = lrTree;
		node.resHeight();
		lChild.resHeight();
		return lChild;
		
	}
	private AVLNode rlBalance(AVLNode node) {
		AVLNode root = node;
		AVLNode rNode = root.getRight();
		AVLNode rlNode = rNode.getLeft();
		AVLNode rlrTree = rlNode.getRight();
		AVLNode rllTree = rlNode.getLeft();
		rNode.left = rlrTree;
		root.right = rllTree;
		rlNode.left = root;
		rlNode.right = rNode;
		rNode.resHeight();
		root.resHeight();
		rlNode.resHeight();
		return rlNode;
	}
	public AVLNode rrBalance(AVLNode node) {
		AVLNode rChild=node.getRight();
		AVLNode rlChild=rChild.getLeft();
		rChild.left=node;
		node.right=rlChild;
		node.resHeight();
		rChild.resHeight();
		return rChild;
	}
	public boolean isEmpty() {
		return root==null;
	}
	
	public void preOrderPrint(AVLNode node) {
        if (node != null) {
        	
        	if(node.value==root.value) {
        		System.out.print(" Root: "+ node.value);
        	}
        	if(node.value<root.value) {
            System.out.print(" Left Subtree: "+node.value);
        	}if(node.value>root.value) {
        		System.out.print(" Right Subtree: "+node.value);
        	}
            preOrderPrint(node.left);
            preOrderPrint(node.right);
        }
    }
	
	
}
