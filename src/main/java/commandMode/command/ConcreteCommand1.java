package commandMode.command;


import commandMode.receiver.ConcreteReceiver1;
import commandMode.receiver.Receiver;

/**
 * @author lianghong
 * @date 2020/3/6
 */
public class ConcreteCommand1 extends Command {


    /**
     * 声明自己默认的接收者
     */
    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    /**
     * 设置新的接受者
     * @param receiver
     */
    public ConcreteCommand1(Receiver receiver) {
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
