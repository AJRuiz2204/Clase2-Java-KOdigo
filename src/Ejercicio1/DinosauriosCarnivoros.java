package Ejercicio1;

import java.util.Scanner;

public class DinosauriosCarnivoros {
    /**
     * 1. Ejercicio Pracitco: Listar Dinosaurios
     * En Jurassic Park, se desea implementar un sistema para listar los dinosaurios
     * disponibles en cada recinto
     * El sistema debe usar arreglos para almacenar los nombres de los dinosaurios y
     * aplicar diferentes tipos de datos y modificadores de acceso.
     * Se utilizará un bucle for para iterar sobre los dinosaurios en cada recinto y
     * mostrar sus nombres.
     */

    public class dinosauriosCarnivoros {
        String[] dinosauriosCar = { "Tyrannosaurus Rex", "Velociraptor", "Spinosaurus", "Allosaurus", "Carnotaurus",
                "Giganotosaurus" };
    }

    public class dinosauriosHerb {
        String[] dinosauriosHer = { "Triceratops", "Brachiosaurus", "Stegosaurus", "Ankylosaurus", "Parasaurolophus",
                "Diplodocus" };
    }

    public class dinosauriosVoladores {
        String[] dinosauriosVol = { "Pteranodon", "Quetzalcoatlus", "Dimorphodon", "Pterosaurio", "Rhamphorhynchus",
                "Pterodaustro" };
    }

    public class dinosauriosMarinos {
        String[] dinosauriosMar = { "Mosasaurus", "Plesiosaurus", "Ichthyosaurus", "Liopleurodon", "Kronosaurus",
                "Elasmosaurus" };
    }

    public class dinosauriosTerrestres {
        String[] dinosauriosTer = { "Tyrannosaurus Rex", "Triceratops", "Stegosaurus", "Brachiosaurus", "Ankylosaurus",
                "Velociraptor" };
    }

    public class Recintos {
        String[] recintos = { "Recinto Carnivoros", "Recinto Herbivoros", "Recinto Voladores", "Recinto Marinos",
                "Recinto Terrestres" };
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Se inicializa el scanner para la entrada de datos
        Recintos rec = new DinosauriosCarnivoros().new Recintos(); // Se crea una instancia de la clase Recintos

        System.out.println("Recintos de Dinosaurios");
        System.out.println("-------------------------");
        System.out.println("Escoja el recinto que desea ver:"); // Se muestra el mensaje para que el usuario elija un recinto
        for (int i = 0; i < rec.recintos.length; i++) { // Se itera sobre los recintos
            System.out.println((i + 1) + ". " + rec.recintos[i]); // Se imprime la lista de recintos
        } // Se imprime la lista de recintos
        System.out.println("6. Salir");
        System.out.println("-------------------------");

        int options = scanner.nextInt();

        switch (options) {
            case 1:
                DinosauriosCarnivoros.dinosauriosCarnivoros carnivoros = new DinosauriosCarnivoros().new dinosauriosCarnivoros(); // Se crea una instancia de la clase dinosauriosCarnivoros
                System.out.println("\nDinosaurios en el Recinto Carnívoros:");
                for (String dinosaurio : carnivoros.dinosauriosCar) {
                    System.out.println("- " + dinosaurio);
                }
                break;
            case 2:
                DinosauriosCarnivoros.dinosauriosHerb herbivoros = new DinosauriosCarnivoros().new dinosauriosHerb();
                System.out.println("\nDinosaurios en el Recinto Herbívoros:");
                for (String dinosaurio : herbivoros.dinosauriosHer) {
                    System.out.println("- " + dinosaurio);
                }
                break;
            case 3:
                DinosauriosCarnivoros.dinosauriosVoladores voladores = new DinosauriosCarnivoros().new dinosauriosVoladores();
                System.out.println("\nDinosaurios en el Recinto Voladores:");
                for (String dinosaurio : voladores.dinosauriosVol) {
                    System.out.println("- " + dinosaurio);
                }
                break;
            case 4:
                DinosauriosCarnivoros.dinosauriosMarinos marinos = new DinosauriosCarnivoros().new dinosauriosMarinos();
                System.out.println("\nDinosaurios en el Recinto Marinos:");
                for (String dinosaurio : marinos.dinosauriosMar) {
                    System.out.println("- " + dinosaurio);
                }
                break;
            case 5:
                DinosauriosCarnivoros.dinosauriosTerrestres terrestres = new DinosauriosCarnivoros().new dinosauriosTerrestres();
                System.out.println("\nDinosaurios en el Recinto Terrestres:");
                for (String dinosaurio : terrestres.dinosauriosTer) {
                    System.out.println("- " + dinosaurio);
                }
                break;
            case 6:
                System.out.println("¡Gracias por visitar Jurassic Park!");
                break;
            default:
                System.out.println("Opción inválida. Por favor, elige una opción del menú.");
        }
        scanner.close();
    }
}
