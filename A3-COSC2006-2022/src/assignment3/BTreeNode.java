package assignment3;

import java.util.Arrays;

public class BTreeNode<E> {
E[] data;
BTreeNode<E> children[];
int dataCount;

public BTreeNode() {
	this(1,2);
}


public BTreeNode(int capacityData, int capacityChildren) {
	data = (E[]) new Object[capacityData];
	children =(BTreeNode<E>[])new Object[capacityChildren];
	this.dataCount = 0;
}

public E[] getData() {
	return data;
}

public void setData(E[] data) {
	this.data = data;
}

public BTreeNode<E>[] getChildren() {
	return children;
}

public void setChildren(BTreeNode<E>[] children) {
	this.children = children;
}

public int getDataCount() {
	return dataCount;
}

public void setDataCount(int dataCount) {
	this.dataCount = dataCount;
}

public String toString() {
	return "BTreeNode [data=" + Arrays.toString(data) + ", children=" + Arrays.toString(children) + ", dataCount="
			+ dataCount + "]";
}


}
