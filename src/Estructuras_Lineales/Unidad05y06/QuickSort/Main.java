package Estructuras_Lineales.Unidad05y06.QuickSort;

public class Main {
    public static void main(String[] args) {
        // Usamos nuestro arreglo de ejemplo de clase
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("\n==========ARREGLO ORIGINAL:==========");
        QuickSort.imprimirArreglo(arreglo);

        // Llamamos al método de ordenamiento Quicksort (desde el índice 0 hasta el final)
        QuickSort.ordenar(arreglo, 0, arreglo.length - 1);

        System.out.println("\n==========ARREGLO ORDENADO CON QUICKSORT:==========");
        QuickSort.imprimirArreglo(arreglo);
    }
}