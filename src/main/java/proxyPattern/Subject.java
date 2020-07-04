package proxyPattern;

/**
 * 抽象主题角色
 * 抽象主题类可以是抽象类也可以是接口，是最普通的业务
 * 类型定义，无特殊要求。
 */
public interface Subject {

    public void request();
}
