public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Barsik");
        Mammal mammal = new Mammal("Dolphin");
        Cat cat = new Cat("Kot");
        Dog dog = new Dog("Sobaka");
        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        cat.greets();
        System.out.println(dog);
        dog.greets();
        dog.greets(dog);        
    }
}