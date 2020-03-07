package commandMode.command;

import commandMode.receiver.Receiver;

/**
 * 抽象command类
 * @author lianghong
 * @date 2020/3/6
 */
public abstract class Command {

    // 定义一个子类全局共享变量
    protected final Receiver receiver;

    // 实现类必须定义一个接收者
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 每个命令都必须有一个执行命令的方法
     */
    public abstract void execute();
}
