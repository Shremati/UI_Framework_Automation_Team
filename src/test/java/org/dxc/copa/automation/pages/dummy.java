package org.dxc.copa.automation.pages;

public class dummy {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public void dummyMethod() {
        setName("sanmati");
        System.out.println(getName());
    }
}
