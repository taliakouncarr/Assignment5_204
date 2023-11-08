
public class TreeNode<T> {
	/**
	 * @author Talia Kouncar
	 */
	protected TreeNode<T> rightChild;
	protected TreeNode<T> leftChild;
	private T data;

	/**
	 * 
	 */
	public TreeNode() {

	}

	/**
	 * Create a new TreeNode with left and right child set to null and data set to the dataNode

	 * @param dataNode
	 */
	public TreeNode(T dataNode) {
		this.rightChild = null;
		this.leftChild = null;
		this.data = dataNode;
	}

	/**
	 * used for making deep copies

	 * @param node
	 */
	public TreeNode(TreeNode<T> node) {
		this.leftChild = node.leftChild;
		this.rightChild = node.rightChild;
		this.data = node.getData();
	}

	/**
	 * 
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * Return the data within this TreeNode

	 * @return
	 */
	public TreeNode<T> getRightChild() {
		return rightChild;
	}

	/**
	 * 
	 * @param rightChild
	 */
	public void setRightChild(TreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	/**
	 * 
	 * @return
	 */
	public TreeNode<T> getLeftChild() {
		return leftChild;
	}

	/**
	 * 
	 * @param leftChild
	 */
	public void setLeftChild(TreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

}