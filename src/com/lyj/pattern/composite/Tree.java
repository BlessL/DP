package com.lyj.pattern.composite;

public class Tree
{
	public TreeNode root = null;

	public Tree(String name)
	{
		root = new TreeNode(name);
	}

	public TreeNode getRoot()
	{
		return root;
	}

	public void setRoot(TreeNode root)
	{
		this.root = root;
	}

	@Override
	public String toString()
	{
		return "Tree [root=" + root + "]";
	}

}
