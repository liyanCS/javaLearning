package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise5 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);

        dog.bark(2, 2.2);
        dog.bark(2.2, 2);

        dog.print(3);
        dog.print(3L);

    }
}

class Dog{
    public void bark(){
        System.out.println("Dault bark");
    }
    public void bark(int i){
        System.out.println("Int bark: howl");
    }
    public void bark(double d){
        System.out.println("Double bark: yip");
    }
    public void bark(int i, double d){
        System.out.println("int, double bark");
    }
    public void bark(double d, int i){
        System.out.println("double, int bark");
    }

    boolean print(int i){
        System.out.println(i);
        return true;
    }
    long print(long i){
        System.out.println(i);
        return i;
    }
}