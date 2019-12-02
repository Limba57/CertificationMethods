package UsingStaticMethodsAndFields;

public class DogTester {

    public static void main(String[] args) {

        Dog husky = new Dog("husky");

        System.out.println(husky.count);
        System.out.println(Dog.count);

        Dog anotherDog = new Dog("anotherDog");
        anotherDog.incrementCounter();

        Dog.incrementCounter();

        System.out.println(Dog.count);
        System.out.println(husky.count);
        System.out.println(anotherDog.count);
        //System.out.println(Dog.name); not an instence
        System.out.println(husky.name);
        System.out.println(anotherDog.name);

        husky = null;
        anotherDog = null;

        System.out.println(Dog.count);
        System.out.println(husky.count);
        System.out.println(anotherDog.count);
        //System.out.println(Dog.name); not an instence
        //System.out.println(husky.name); null pointer exeption
        //System.out.println(anotherDog.name); null pointer exeption

        // exam exemple
        Dog.count = 10;
        Dog newDog = new Dog();
        Dog dog2 = new Dog();
        newDog.count = 5;
        newDog.count = 11;
        System.out.println(Dog.count);
        System.out.println(newDog.count);
        System.out.println(dog2.count);


    }
}
