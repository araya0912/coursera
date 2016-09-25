/*
  PracticaSemana1.java
  Uso de bucles y arreglos. Genera la tabla de multiplicar del 1 al 10 y la muesta en pantalla

  Autor: Alejandro Adolfo Perez Raya (araya0912@hotmail.com)
  Modificado: 24 de sept. de 2016
*/
public class PracticaSemana1 {
  public static void main(String[] args) {
    //Creacion de la matriz
    int[][] tabla = new int[10][10];

    //Llenado de la matriz
    for (int i=0; i < 10; i++ ) {
      for (int j=0; j < 10 ; j++ ) {
        tabla[i][j] = (i+1) * (j+1);
      }//Fin for j
    }//Fin for i

    //Impresion de la matriz
    for (int[] fila: tabla) {
      for (int i=0; i< 10 ; i++ ) {
        System.out.print(fila[i] + "\t");
      }//fin for
      System.out.println("");
    }//Fin foreach

  }//Fin main
}//Fin class PracticaSemana1
