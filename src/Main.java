import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

  private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

      welcome();

      int opcion = teclado.nextInt();
      teclado.nextLine();

      switch (opcion){
        case 1:
            nombrarFile();
            teclado.close();
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 0:
          break;
        default:
          System.out.println("Por favor, introduzca una opción válida.");
          break;
      }





    }



    public static void welcome(){
        System.out.println();
        System.out.println("############ Writer ############");
        System.out.println("################################");
        System.out.println("1 . Escribir en un archivo");
        System.out.println("2 . Leer un archivo");
        System.out.println("3 . Borrar un archivo");
        System.out.println("4 . Listar ficheros de un directorio");
        System.out.println("5 . Establecer directorio de trabajo");
        System.out.println("0 . Salir");
        System.out.println("################################");
    }


    public static void nombrarFile(){
      System.out.println("Introduzca el nombre del archivo ->");
      String fileName = teclado.nextLine();
      System.out.println("Texto:");
      String contenido = teclado.nextLine();
      try(FileWriter escritura = new FileWriter(fileName)){
        escritura.write(contenido);
        System.out.println("El archivo " + fileName + " ha sido creado/modificado con éxito.");
      } catch (IOException e) {
        System.err.println("Error al crear/modificar el archivo." + e.getMessage());
      }
    }

    public static void leerFile(){

      System.out.println("Introduzca el nombre del archivo que desea leer ->");
      String fileName = teclado.nextLine();
      try(FileReader lector = new FileReader(fileName)){

      } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }





}