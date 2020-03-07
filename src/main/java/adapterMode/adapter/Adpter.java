package adapterMode.adapter;

import adapterMode.adaptee.Adaptee;
import adapterMode.target.Target;

public class Adpter extends Adaptee implements Target {


    public void request() {
        super.doSomething();
    }
}
