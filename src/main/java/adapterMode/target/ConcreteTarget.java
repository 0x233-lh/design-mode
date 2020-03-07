package adapterMode.target;

/**
 * 目标实现类
 */
public class ConcreteTarget implements Target {


    public void request() {
        System.out.println("ConcreteTarget：来呀！快活呀~");
    }
}
