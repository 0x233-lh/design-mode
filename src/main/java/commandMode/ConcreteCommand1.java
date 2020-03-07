package commandMode;


/**
 * @author lianghong
 * @date 2020/3/6
 */
public class ConcreteCommand1 extends Command {

    /**
     *  对哪一个Receiver类进行命令处理
     */
    private Receiver receiver;

    /**
     * 传递接受者
     * @param receiver
     */
    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
