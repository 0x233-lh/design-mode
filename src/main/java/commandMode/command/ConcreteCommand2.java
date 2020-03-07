package commandMode.command;


import commandMode.receiver.ConcreteReceiver2;
import commandMode.receiver.Receiver;

/**
 * @author lianghong
 * @date 2020/3/6
 */
public class ConcreteCommand2 extends Command {

    /**
     * 设置自己默认的接受者
     */
    public ConcreteCommand2() {
        super(new ConcreteReceiver2());
    }

    /**
     * 设置自己的接受者
     * @param receiver
     */
    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
