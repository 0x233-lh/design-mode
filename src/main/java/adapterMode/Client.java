package adapterMode;

import adapterMode.adapter.Adpter;
import adapterMode.target.ConcreteTarget;
import adapterMode.target.Target;

public class Client {

    /**
     * 适配器模式：起到中间角色转换的作用
     * 1. 适配器模式有三类角色
     *  1.1 Target（目标角色）：该角色定义把其他类转换为何种接口，我们所需要的转换成的接口
     *  1.2 Adaptee （源角色）：把x转换为目标角色，这个x就是源角色，它是已经存在的、运行良好的类和对象
     *  1.3 Adapter（适配器角色）：职责就是把源角色转换为目标角色
     *      1.3.1 继承：通过继承可以将单一接口转换为目标角色
     *      1.3.2 类关联：如果需要将多个目标角色转换为一个源角色，通过类关联的方式会更加灵活
     * 2. 适配器模式适用的场景
     *  在系统设计阶段不要考虑适配器，它不是解决处于开发阶段的问题，是解决服役的项目问题
     * @param args
     */
    public static void main(String[] args) {

        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        // 增加了适配器角色后的业务逻辑
        Target target2 = new Adpter();
        target2.request();
    }
}
