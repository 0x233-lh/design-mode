package proxyPattern.forceProxy;

import java.time.LocalDateTime;

/**
 * <h1>强制代理模式</h1>
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        // 开始打游戏，记下时间戳
        System.out.println("startTime: " + LocalDateTime.now());
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("endTime: " + LocalDateTime.now());
    }
}
