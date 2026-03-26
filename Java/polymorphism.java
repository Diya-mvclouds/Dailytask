class Animals{
    void eat(){
        System.out.println("Animals are eating");
    }
}
class Dog extends Animals{
    @Override
    void eat(){
        System.out.println("Dog is eating biscuits");
    }
}
class Cat extends Animals{
    @Override
    void eat(){
        System.out.println("Cat is drinking milk");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Animals d = new Dog();
        Animals c = new Cat();
        d.eat();
        c.eat();
    }
}