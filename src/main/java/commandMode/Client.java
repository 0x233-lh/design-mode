package commandMode;

/**
 * 场景类
 * @author lianghong
 * @date 2020/3/6
 */
public class Client {


    public static void main(String[] args) {
        // 首先声明调用Invoker
        Invoker invoker = new Invoker();

        // 定义接受者
        Receiver receiver = new ConcreteReceiver1();

        // 定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);

        // 把命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();

    }
}
