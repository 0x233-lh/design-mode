package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    // 构件容器
    private List<Component> componentList = new ArrayList();

    /**
     * 增加一个叶子构件或者树枝构件
     * @param component
     */
    public void add(Component component) {
        this.componentList.add(component);
    }

    /**
     * 删除一个叶子构件或者树枝构件
     * @param component
     */
    public void delete(Component component) {
        this.componentList.remove(component);
    }

    /**
     * 获得分支下的所有叶子构件和树枝构件
     * @return
     */
    public List<Component> getChildren() {
        return this.componentList;
    }

    @Override
    public void doSomething() {
        System.out.println("composite: 我是树枝构件");
    }
}
