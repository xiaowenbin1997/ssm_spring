package org.example.ba4;

public class School {
    private String address;
    private String name;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
