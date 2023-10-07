package com.runsen.base;

import java.io.Serializable;
import java.util.Objects;

public class MyClass implements Serializable {
    private int id;
    private String name;

    // 构造方法等其他成员

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return id == myClass.id && Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
