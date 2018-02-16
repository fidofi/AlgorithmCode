package Tree.BinarySortTree;

import java.util.Stack;

/**
 * Created by fido on 2018/1/30.
 * 排序二叉树
 */
public class BinarySortTree implements TreeMethods {
    private Node root;//二叉树的根结点

    public BinarySortTree(Node root) {
        this.root = root;
    }

    public BinarySortTree(int value) {
        root = new Node(value);
    }

    /**
     * 查找某个值
     * 排序二叉树
     * 左子树的值都比根节点小
     * 右子树的值都比根节点大
     *
     * @param value
     * @return
     */
    @Override
    public Node findKey(int value) {
        Node current = root;
        if (value == current.getValue())
            return current;
        while (value != current.getValue()) {
            if (current == null) {
                break;
            }
            if (value > current.getValue()) {
                current = current.getRight();
                continue;
            }
            if (value < current.getValue()) {
                current = current.getLeft();
                continue;
            }
        }
        return current;
    }

    /**
     * 插入新节点
     * 规则与查找时类似
     *
     * @param value
     * @return
     */
    @Override
    public String insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return "插入成功";
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (value == parent.getValue()) {
                return "该值早已存在";
            }
            //若比当前的节点的值大，则插入至右子树
            if (value > parent.getValue()) {
                current = parent.getRight();
                if (current == null) {
                    parent.setRight(node);
                    break;
                }
            }
            //若比当前的节点值小，则插入至左子树
            if (value < parent.getValue()) {
                current = parent.getLeft();
                if (current == null) {
                    parent.setLeft(node);
                    break;
                }
            }
        }
        return "插入成功";
    }

    /**
     * 中序遍历递归方法实现
     * 左-根-右
     */
    @Override
    public void inOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.getLeft());
        System.out.print(node.getValue() + " ");
        inOrderTraverse(node.getRight());
    }

    public void showinOrderTraverse() {
        if (root == null) {
            System.out.println("该树为空");
        }
        System.out.println("--使用递归方法进行中序遍历--");
        inOrderTraverse(root);
    }

    /**
     * 用非递归方法实现
     */
    @Override
    public void inOrderByStack() {
        if (root != null) {
            Node current = root;
            System.out.println("--使用非递归方法进行中序遍历--");
            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || current != null) {
                if (current != null) {
                    stack.push(current);
                    current = current.getLeft();
                } else {
                    current = stack.pop();
                    System.out.print(current.getValue() + " ");
                    current = current.getRight();
                }
            }
        }
    }

    /**
     * 先序遍历递归方法实现
     * 根-左-右
     */
    @Override
    public void preOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrderTraverse(node.getLeft());
        preOrderTraverse(node.getRight());
    }

    public void showpreOrderTraverse() {
        if (root == null) {
            System.out.println("该树为空");
        }
        System.out.println("--使用递归方法进行先序遍历--");
        preOrderTraverse(root);
    }

    @Override
    public void preOrderByStack() {
        if (root != null) {
            System.out.println("--使用非递归方法进行先序遍历--");
            Stack<Node> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()) {
                Node head = stack.pop();
                System.out.print(head.getValue() + " ");
                if (head.getRight() != null)
                    stack.push(head.getRight());
                if (head.getLeft() != null)
                    stack.push(head.getLeft());
            }
        }
    }

    /**
     * 后序遍历递归方法实现
     * 左-右-根
     */
    @Override
    public void postOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.getLeft());
        postOrderTraverse(node.getRight());
        System.out.print(node.getValue() + " ");
    }

    public void showpostOrderTraverse() {
        if (root == null) {
            System.out.println("该树为空");
        }
        System.out.println("--使用递归方法进行后序遍历--");
        postOrderTraverse(root);
    }

    @Override
    public void postOrderByStack() {
        if (root != null) {
            System.out.println("--使用非递归方法(两个栈）进行后序遍历--");
            Stack<Node> stack1 = new Stack<Node>();
            Stack<Node> stack2 = new Stack<Node>();
            stack1.push(root);
            while (!stack1.isEmpty()) {
                Node cur = stack1.pop();
                stack2.push(cur);
                if (cur.getLeft() != null) {
                    stack1.push(cur.getLeft());
                }
                if (cur.getRight() != null) {
                    stack1.push(cur.getRight());
                }
            }
            while (!stack2.isEmpty()) {
                System.out.print(stack2.pop().getValue() + " ");
            }
        }

    }

    public void postOrderByStackOne() {
        if (root != null) {
            System.out.println("--使用非递归方法(一个栈）进行后序遍历--");
            Stack<Node> stack = new Stack<Node>();
            Node head = root;
            stack.push(head);
            Node cur = null;
            while (!stack.isEmpty()) {
                cur = stack.peek();
                if (cur.getLeft() != null && head != cur.getLeft() && head != cur.getRight()) {
                    stack.push(cur.getLeft());
                } else if (cur.getRight() != null && head != cur.getRight()) {
                    stack.push(cur.getRight());
                } else {
                    System.out.print(stack.pop().getValue() + " ");
                    head = cur;
                }
            }
        }
    }

    @Override
    public int getMinValue() {
        return 0;
    }

    /**
     * 删除某个结点
     * 分情况
     *
     * @param value
     * @return
     */

    @Override
    public boolean delete(int value) {
        Node parent = root;
        Node current = parent;
        boolean isLeft = false;//被删除节点是其父节点的左孩子
        while (current.getValue() != value) {
            //没找到
            if (current == null) {
                return false;
            }
            parent = current;
            if (value > current.getValue()) {
                isLeft = false;
                current = current.getRight();
            } else {
                isLeft = true;
                current = current.getLeft();
            }
        }
        //current就是要删除的节点
        //1.被删除的节点即无左孩子也无右孩子
        if (current.getLeft() == null && current.getRight() == null) {
            if (isLeft)
                parent.setLeft(null);
            else
                parent.setRight(null);
            return true;
        }
        //2.被删除的节点只有一个孩子
        if (current.getLeft() == null) {
            if (root.getValue() == value) {
                root = root.getRight();
                return true;
            }
            //只有右孩子
            if (isLeft) {
                parent.getLeft().setValue(current.getRight().getValue());
                current.setRight(null);
            } else {
                parent.getRight().setValue(current.getRight().getValue());
                current.setRight(null);
            }
            return true;
        }
        if (current.getRight() == null) {
            if (root.getValue() == value) {
                root = root.getLeft();
                return true;
            }
            if (isLeft) {
                parent.getLeft().setValue(current.getLeft().getValue());
                current.setLeft(null);
            } else { //只有左孩子
                parent.getRight().setValue(current.getLeft().getValue());
                current.setLeft(null);
            }
            return true;
        }
        //被删除节点有左孩子也有右孩子
        Node deleteNode = current;
        Node node = null;
        while (deleteNode.getLeft() != null) {
            node = deleteNode;
            deleteNode = deleteNode.getLeft();
        }
        node.setLeft(null);
        //被删除节点为根节点
        if (root.getValue() == value) {
            root.setValue(deleteNode.getValue());
            return true;
        }
        if (isLeft) {
            parent.getLeft().setValue(deleteNode.getValue());
        } else {
            parent.getRight().setValue(deleteNode.getValue());
        }
        return true;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
