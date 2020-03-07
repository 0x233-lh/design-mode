package commandMode;

/**
 * 抽象command类
 * @author lianghong
 * @date 2020/3/6
 */
public abstract class Command {

    /**
     * 每个命令都必须有一个执行命令的方法
     */
    public abstract void execute();
}
