package Tree.BinarySortTree;

/**
 * Created by fido on 2018/1/30.
 * 相关方法接口
 */
public interface TreeMethods {

    public Node findKey(int value);   //查找

    public String insert(int value);  //插入

    public void inOrderTraverse(Node node);    //中序遍历递归操作

    public void inOrderByStack();     //中序遍历非递归操作

    public void preOrderTraverse(Node node);  //前序遍历

    public void preOrderByStack();   //前序遍历非递归操作

    public void postOrderTraverse(Node node); //后序遍历

    public void postOrderByStack();  //后序遍历非递归操作

    public int getMinValue(); //得到最小(大)值

    public boolean delete(int value); //删除
}
