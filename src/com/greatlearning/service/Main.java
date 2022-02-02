package com.greatlearning.service;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public TreeNode node;
	Queue<TreeNode> buffer_queue;
	
	public void convertTreeToSkewed() {
		buffer_queue = new LinkedList<>();
		
		addNodesToQueueInorder(node);
		
		
		TreeNode temp = node = buffer_queue.remove();
		while(!buffer_queue.isEmpty()) {
			temp.right = buffer_queue.remove();
			temp = temp.right;
		}
	}

	private void addNodesToQueueInorder(TreeNode node) {
		if(node == null) {
			return;
		}
		
		addNodesToQueueInorder(node.left);
		node.left = null;
		buffer_queue.add(node);
		addNodesToQueueInorder(node.right);
		node.right = null;
	}
	
	public void inorderTraversal(TreeNode node) {
		if(node == null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.print(node.getData() + " ");
		inorderTraversal(node.right);
	}
	
	public void verifySkewed() {
		TreeNode temp = node;
		while(temp != null) {
			if(temp.left != null) {
				System.out.println("Not a skewed tree!");
				return;
			}
		}
		System.out.println("BST is converted successfully to skewed tree");
	}
	
}