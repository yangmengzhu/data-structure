

class Animal{
    protected String name;
    public Animal(String name){
        this.name=name;
        System.out.println("Animal:String");
    }
    public void eat(){
        System.out.println(this.name+"Animal:eat");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.name+"Cat:eat");
    }
    public int count=0;
}
public class Demo1 {
    public static void main(String[] args) {
        Animal animal=new Cat("haha");
         animal.eat();
        /*Animal animal1=new Cat("hehe");
        animal1.eat();*/
        /*Cat cat=new Cat("mimi");
        func();*/
    }

    private static Animal func() {
        return new Cat("MIMI");
    }

    /*private static void func(Animal animal) {
        animal.eat();
    }*/

}
