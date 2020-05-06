public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal animalFactory = new FactoryAnimal();

        Animal animalNum1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + animalNum1.makeSound());

        Animal animalNum2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + animalNum2.makeSound());
    }
}
