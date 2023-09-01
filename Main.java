public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(null, null, "Александр");
        Owner own = new Owner();

        cat.setName(Constants.cat_name);
        cat.setAge(Constants.gat_age);
        own.setOwnerName("Александр");

        cat.greet();
        cat.makeSound();
        own.makeSound();
        own.callAnimal();
    }
}
