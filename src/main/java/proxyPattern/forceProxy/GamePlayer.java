package proxyPattern.forceProxy;


import java.util.Objects;

public class GamePlayer implements IGamePlayer {

    private String name;
    private IGamePlayer proxyPlayer;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (isProxy()) {
            System.out.println("[realPlayer login] user:" + user + ", password: " + password);
        } else {
            System.out.println("请使用指定的代理类进行访问");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.println("[realPlayer] killBoss!!");
        } else {
            System.out.println("请使用指定的代理类进行访问");
        }
    }

    @Override
    public void upgrade() {
        if (isProxy()) {
            System.out.println("[realPlayer] upgrade!!");
        } else {
            System.out.println("请使用指定的代理类进行访问");
        }
    }

    /**
     * 获取自己的代理类
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        this.proxyPlayer = new GamePlayerProxy(this);
        return this.proxyPlayer;
    }

    /**
     * 校验是否代理类范围<br>
     * TODO: 这里感觉有问题且不够严谨，代理对象不为空也不能证明是代理对象访问的
     * @return
     */
    private boolean isProxy() {
        return Objects.nonNull(this.proxyPlayer);
    }
}
