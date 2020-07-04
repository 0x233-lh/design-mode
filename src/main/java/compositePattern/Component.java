package compositePattern;

/**
 * 抽象构件
 * 个体和整体都具有的共享
 */
public abstract class Component {

    public void doSomething() {
        System.out.println("component: 我是抽象构件");
    }
}
