package exercise1;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void greets();
}
