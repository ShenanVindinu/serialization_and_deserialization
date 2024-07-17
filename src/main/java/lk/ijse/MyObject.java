package lk.ijse;

import java.io.Serial;
import java.io.Serializable;

class MyObject implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int value;

    public MyObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyObject{name='" + name + "', value=" + value + '}';
    }
}
