package commandMode;

/**
 * @author lianghong
 * @date 2020/3/6
 */
public class Invoker {


    private Command command;

    /**
     * 接收命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }
}
