package Tree.BinarySortTree;

/**
 * Created by fido on 2018/1/30.
 */
public class MainTest {
    public static void main(String[] args) {
        BinarySortTree tree = new BinarySortTree(6);
//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//            String mesg = Tree.insert(random.nextInt(50));
//            System.out.println(mesg);
//        }
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);
        tree.insert(3);
        tree.insert(4);
        tree.insert(8);
        tree.showinOrderTraverse();
        System.out.println(" ");
        tree.inOrderByStack();
        System.out.println(" ");
        tree.showpostOrderTraverse();
        System.out.println(" ");
        tree.postOrderByStack();
        tree.showpreOrderTraverse();
        System.out.println(" ");
        tree.preOrderByStack();
        tree.delete(1);
        System.out.println("");
        System.out.println("删除后：");
        tree.showinOrderTraverse();
        System.out.println(" ");
        tree.inOrderByStack();
        System.out.println(" ");
        tree.showpostOrderTraverse();
        System.out.println(" ");
        tree.postOrderByStack();
        System.out.println(" ");
        tree.showpreOrderTraverse();
        System.out.println(" ");
        tree.preOrderByStack();
    }
}
