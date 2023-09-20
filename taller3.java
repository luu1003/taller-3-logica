package enClase;

import java.lang.reflect.Array;
import java.util.Scanner;

public class taller3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // iniciar el scanner

    System.out.println(
        "ingrese la cantidad de materias"); // solicitar la cantidad de materias
    int cantidadMaterias = scanner.nextInt();

    double[][] materias = new double[cantidadMaterias][];
    double[] notaFinal = new double[Array.getLength(
        materias)]; //se crean 3 arraigos: el de materias, el de las notas finales y el de los nombres de cada materia
    String[] nombreMaterias = new String[Array.getLength(materias)];

    for (int x = 0; Array.getLength(materias) > x;
        x++) { //ciclo 1 = nombre

      System.out.println("ingrese el nombre de la materia"); //solicitar el nombre de las materias
      nombreMaterias[x] = scanner.next();

      System.out.println("ingrese cantidad de notas de " + nombreMaterias[x]); //solicitar la cantidad de notas de cada materia
      int size = scanner.nextInt();

      double[] notas = new double[size];
      double[] porcentajes = new double[Array.getLength(notas)];

      for (int contador = 0; Array.getLength(notas) > contador;
          contador++) {  //ciclo 2 (dentro de ciclo 1) = solicitar notas y porcentajes
        System.out.println("ingrese nota numero " + (contador + 1) + " de " + nombreMaterias[x]);
        notas[contador] = scanner.nextDouble();
        System.out.println(
            "ingrese el porcentaje de la nota numero " + (contador + 1) + " de "
                + nombreMaterias[x]);
        porcentajes[contador] = scanner.nextDouble();

      }

      for (int contador = 0; Array.getLength(notas) > contador;
          contador++) {  //ciclo 3 (dentro de ciclo 1) = calcular la nota final del las materias
        notaFinal[contador] =
            notaFinal[contador] + (notas[contador] * (porcentajes[contador] / 100));
      }

    }

    for (int x = 0; Array.getLength(notaFinal) > x;
        x++) {  //ciclo 4 = imprimir el  promedio de cada materia

      System.out.println("la nota de la materia " + nombreMaterias[x] + " es " + notaFinal[x]);

    }

    scanner.close();

  }

}