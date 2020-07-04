package compositePattern;

/**
 * 场景类负责树状结构的构件，并且可以通过递归的方式编译整个树
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();

        // 创建一个树枝构件
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf leaf = new Leaf();

        // 建立整体
        root.add(branch);
        branch.add(leaf);

        // 遍历
        display(root);
    }

    public static void display(Composite root) {
        for (Component c : root.getChildren()) {
            c.doSomething();
            if (c instanceof Composite) {
                display((Composite) c);
            }
        }
    }
}
