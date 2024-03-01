import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    byte edad;
    int numApart, numVisit, piso;
    long tel;
    String nom, ape;

        System.out.println("\n\n\t\t\t\t\tBienvenido al Edificio 28");
        System.out.println("\n\t\tPorfavor ingrese su nombre:");
        nom = scanner.next();
        System.out.println("\n\t\tIngrese su apellido:");
        ape = scanner.next();
        System.out.println("\n\t\tIngrese su edad:");
        edad = scanner.nextByte();
        System.out.println("\n\t\tBrindenos su numero de Telefono:");
        tel = scanner.nextLong();
        System.out.println("\n\t\tDigame a que numero de piso se dirige:");
        piso = scanner.nextInt();
        System.out.println("\n\t\t¿Hacia que habitacion se dirije? ");
        numApart = scanner.nextInt();
        System.out.println("\n\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
        numVisit = scanner.nextInt();

        System.out.println("\n\n\t\t\t\t\tBienvenido al Edificio 28");
        System.out.println("\n\n\t\t\tNombre del visitante: " + nom + ape);
        System.out.println("\t\t\tSu edad es: " + edad);
        System.out.println("\t\t\tSu numero de telefono es: " + tel);
        System.out.println("\t\t\tNumero de piso al que se dirige: " + piso);
        System.out.println("\t\t\tNumero de habitación: " + numApart);
        System.out.println("\t\t\tCantidad de visitantes ingresados: " + numVisit);


    }

}


