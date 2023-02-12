package HausworksJava;

import java.util.LinkedList;
import java.util.Objects;

public abstract class Person {
    private String name;
    private int years;
    private int height;
    private double weight;

    abstract void die();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears(int i) {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    LinkedList<String> children = new LinkedList<>();

    public LinkedList<String> getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return years == person.years && height == person.height && Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name) && children.equals(person.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, years, height, weight, children);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", height=" + height +
                ", weight=" + weight +
                ", children=" + children +
                '}';
    }
}

