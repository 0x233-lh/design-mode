package proxyPattern.forceProxy;


public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代理登录
     * @param user
     * @param password
     */
    @Override
    public void login(String user, String password) {
        gamePlayer.login(user, password);
    }

    /**
     * 代理杀怪
     */
    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    /**
     * 代理升级
     */
    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }

    /**
     * 代理类没有被代理，只能返回自己
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
