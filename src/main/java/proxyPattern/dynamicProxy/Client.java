package proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

/**
 * <h1>动态代理</h1>
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayerIH(gamePlayer);
        // 开始打游戏并记录时间戳
        System.out.println("startTime: " + LocalDateTime.now());
        // 获得类的classloader
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        // 动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);

        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("endTime: " + LocalDateTime.now());
    }
}
