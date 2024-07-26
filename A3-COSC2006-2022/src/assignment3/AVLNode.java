package assignment3;

public class AVLNode{
	
	int height;
	int value;
	AVLNode left;
	AVLNode right;
	
	public AVLNode(int value) {
		this(value, null, null);
		height=0;
	}
	public AVLNode(int value, AVLNode left, AVLNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
		height=0;
	}
	
	public AVLNode getLeft(){
		return left;
	}
	
	public AVLNode getRight(){
		return right;
	}
	public int getHeight() {
		return height;
	}
	public int getValue() {
		return value;
	}
	public void resHeight() {
		int leftH=-1;
		int rightH=-1;
		if(left!=null) {
			leftH=left.height;
		}
		if(right!=null) {
			rightH=right.height;
		}
		height = 1 + Math.max(leftH, rightH);
	}

}
