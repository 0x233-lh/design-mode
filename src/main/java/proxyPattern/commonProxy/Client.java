package proxyPattern.commonProxy;

import java.time.LocalDateTime;

/**
 * <h1>普通代理模式</h1>
 * 调用者不需要知道真实的执行角色是谁，只需要知道代理类就行<br>
 * 由于屏蔽了真实角色的变化对高层模块的影响，真实的角色想怎么修改就怎么修改<br/>
 * 对高层模块没有任何影响
 */
public class Client {

    public static void main(String[] args) {
        // 代理类
        GamePlayerProxy proxy = new GamePlayerProxy("张三");
        // 开始打游戏，记录时间戳
        System.out.println("startTime: " + LocalDateTime.now());
        proxy.login("root", "123");
        proxy.killBoss();
        proxy.upgrade();
        // 结束游戏
        System.out.println("endTime: " + LocalDateTime.now());
    }
}
