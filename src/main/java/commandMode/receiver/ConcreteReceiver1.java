package commandMode.receiver;

/**
 * 具体的Receiver
 * @author lianghong
 * @date 2020/3/6
 */
public class ConcreteReceiver1 extends Receiver {


    @Override
    public void doSomething() {
        System.out.println("concreteReceiver1：我做了某些事情了！");
    }
}
