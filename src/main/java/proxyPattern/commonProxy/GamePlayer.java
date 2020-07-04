package proxyPattern.commonProxy;

import java.util.Objects;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(IGamePlayer gamePlayer, String name) {
        if (Objects.isNull(gamePlayer)) {
            throw new IllegalArgumentException("不能创建真实的角色!");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("[realPlayer login] user:" + user + ", password: " + password);
    }

    @Override
    public void killBoss() {
        System.out.println("[realPlayer] killBoss!!");
    }

    @Override
    public void upgrade() {
        System.out.println("[realPlayer] upgrade!!");
    }
}
