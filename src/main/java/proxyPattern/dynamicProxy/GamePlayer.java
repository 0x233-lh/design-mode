package proxyPattern.dynamicProxy;

import java.util.Objects;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
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
