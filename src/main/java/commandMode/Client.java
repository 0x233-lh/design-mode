package commandMode;

import commandMode.command.Command;
import commandMode.command.ConcreteCommand1;
import commandMode.invoker.Invoker;

/**
 * 场景类
 * @author lianghong
 * @date 2020/3/6
 */
public class Client {


    /**
     * 命令模式：
     * 1. 该模式大致拥有三个角色：Command、Receiver、Invoker
     *  1.1 Command(命令)：拥有一个或者多个的接收者
     *  1.2 Receiver（接收者）：真正执行命令的角色
     *  1.3 Invoker（调用者）：设置命令，执行命令的角色
     *
     * 2. 优点：
     *  2.1 类间解耦。调用者角色和接收者角色没有任何依赖关系，调用者实现功能只需要调用command抽象类
     *      的execute方法就行，不需要了解到底是哪一个接收者
     *  2.2 可拓展。 command的子类非常容易拓展，而调用者invoker和高层次模块的client不产生严重的
     *      代码耦合。
     *  2.3 与其他模式搭配会更优秀。
     *      2.3.1 结合责任链模式可以实现命令族解析任务
     *      2.3.2 结合模板方法，可以减少command子类膨胀问题
     * @param args
     */
    public static void main(String[] args) {
        // 首先声明调用Invoker
        Invoker invoker = new Invoker();

        // 每个命令都有自己的接受者，所以可以减少高层类client对receiver的依赖
        Command command = new ConcreteCommand1();

        // 把命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();

    }
}
