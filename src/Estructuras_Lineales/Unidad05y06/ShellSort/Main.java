package Estructuras_Lineales.Unidad05y06.ShellSort;

public class Main {
    public static void main(String[] args) {
        // Usamos el mismo arreglo de ejemplo de clase
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("\n==========ARREGLO ORIGINAL:==========");
        ShellSort.imprimirArreglo(arreglo);

        // Llamamos al método de ordenamiento ShellSort
        ShellSort.ordenar(arreglo);

        System.out.println("\n==========ARREGLO ORDENADO CON SHELLSORT:==========");
        ShellSort.imprimirArreglo(arreglo);
    }
}