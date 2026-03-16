interface parent1{
    void father();
}

interface parent2{
    void mother();
}

public class child implements parent1,parent2{

    public void father(){
        System.out.println("I'm Father");
    }
    public void mother(){
        System.out.println("I'm Mother");
    }
    public static void main(String[] args) {
        child c = new child();
        c.mother();
        c.father();
    }
}
