package commandMode.receiver;

/**
 * 具体的Receiver
 * @author lianghong
 * @date 2020/3/6
 */
public class ConcreteReceiver2 extends Receiver {


    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiver2：我做了某些事情了！！");
    }
}
