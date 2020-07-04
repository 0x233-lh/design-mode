package compositePattern;

/**
 * 叶子构件没有下级对象，需要定义参加组合的原始对象行为
 */
public class Leaf extends Component {

    @Override
    public void doSomething() {
        System.out.println("Leaf: 我是叶子构件");
    }
}
