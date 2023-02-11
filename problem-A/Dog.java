public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(another Dog){
        System.out.println("Woooof");
    }

    @Override
    public String toString(){
        return String.format("Dog[%s]", super.toString());
    }
}
