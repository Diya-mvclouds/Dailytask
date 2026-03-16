class animals{
    void eat(){
        System.out.println("Eating...");
    }
}

class dog extends animals{
    void sleep(){
        System.out.println("Sleeping...");
    }
}

class puppy extends dog{
    void bark(){
        System.out.println("Barking...");
    }

    public static void main(String[] args) {
        puppy p = new puppy();
        p.bark();
        p.sleep();
        p.eat();
    }
}