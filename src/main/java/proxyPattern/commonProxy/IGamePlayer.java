package proxyPattern.commonProxy;

public interface IGamePlayer {

    /**
     * 登录游戏
     * @param user
     * @param password
     */
    void login(String user, String password);

    /**
     * 杀死怪物
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
