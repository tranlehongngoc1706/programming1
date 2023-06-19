package Question1;

public class Zoo {
    public static void main(String[] args) {
        Mammal dolphin = new Mammal("Steven");

        Dog corgi = new Dog("Steph");
        Dog chihuahua = new Dog("Steve");

        Cat black = new Cat("Sophia");

        corgi.greets(chihuahua);
        chihuahua.greets();
        System.out.printf(corgi.toString());
        black.greets();
        System.out.println(dolphin.getName());

    }
}