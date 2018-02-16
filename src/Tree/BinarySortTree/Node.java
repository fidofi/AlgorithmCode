package Tree.BinarySortTree;

/**
 * Created by fido on 2018/1/30.
 * 代表二叉树的节点
 */
public class Node {
    private int value;//当前节点存储的值
    private Node left;//左孩子
    private Node right;//右孩子

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
