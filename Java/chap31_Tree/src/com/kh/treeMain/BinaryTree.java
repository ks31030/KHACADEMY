package com.kh.treeMain;
/*
 ��带 �����ϰ� ���ư��� ����ϴ� ���� Ʈ��.
 ���� ��ȸ : root(�Ѹ�)�� ���� �湮.
 ���� ��ȸ : ���� ���� Ʈ���� �湮�� ���� root �湮.
 ���� ��ȸ : ���� Ʈ�� ��� �湮 �� root �湮.
 ���� ��ȸ : ���� node����� �Ʒ��������� ���ʴ�� �湮.
 */
public class BinaryTree {
	TreeNode root;
	public BinaryTree() {
		this.root = null;
	}
	/*
	 insert �ż���� insertRac �޼���� ���� Ʈ���� ���ο� ��带 �����ϴ� �� ���.
	 */
	//insert : �ܺο� ���� �Ǵ� �޼���.
	public void insert(int data) {
		root = insertRec(root, data);
	}
	//insertRec ���� ���� �۾� �޼���
	//����� : �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���� ����.
	//��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����.
	private TreeNode insertRec(TreeNode root, int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	/*
	 inOrderT : ���� ��ȸ
	 inOrderTR : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴ� �� ���.
	 ���� ���� Ʈ�� ���� ��� ������  ���� Ʈ�� ������ ��� ���.
	 */
	public void inOrderT() {//inOrder Traversal ���� ��ȸ
		inOrderTR(root);
	}
	private void inOrderTR(TreeNode root) {
		if(root != null) {
			inOrderTR(root.left);
			System.out.println("root.left : " + root.data + " ");
			inOrderTR(root.right);
			System.out.println("root.right : " + root.data + " ");
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(150);
		tree.insert(130);
		tree.insert(170);
		tree.insert(200);
		tree.insert(140);
		tree.insert(160);
		tree.insert(180);
		
		System.out.println("���� Ʈ���� ���� ��ȸ ��� : ");
		tree.inOrderT();
	}

}
