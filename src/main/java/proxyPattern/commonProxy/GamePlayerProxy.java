package proxyPattern.commonProxy;

public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {
        gamePlayer = new GamePlayer(this, name);
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
}
