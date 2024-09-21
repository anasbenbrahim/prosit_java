import java.util.Scanner;

public class ZooMangement {
    public static void main(String[] args) {

        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal crocodile = new Animal("Reptiles", "Crocodile", 7, false);
        Animal panda = new Animal("Ursidés", "Panda", 4, true);

        System.out.println(lion.toString());
        System.out.println(panda);
        crocodile.displayAnimal();

        System.out.println("*********************************************");

        Zoo myZoo = new Zoo("Parc National", "Paris", 4);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

    }
}
