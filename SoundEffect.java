public interface SoundEffect {
    void makeSound();
    default void callAnimal() {
        System.out.println( "Коржик мяукнул!" );
    }
}