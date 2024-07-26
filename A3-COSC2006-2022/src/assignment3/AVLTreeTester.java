package assignment3;

public class AVLTreeTester {
	public static void main(String[] args){
	
		AVLTree a=new AVLTree();
		System.out.println("Is it empty? "+a.isEmpty());
		a.add(1);
		a.add(5);
		a.add(10);
		a.add(90);
		a.add(55);
		a.add(77);
		a.add(9);
		System.out.println("Is it empty? "+a.isEmpty());
		a.preOrderPrint(a.root);
		

	}
}

