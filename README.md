# Práctica Unidad 5: QuickSort y ShellSort

**Asignatura:** AED-1026 Estructura de Datos

**Docente:** Víctor Hugo Vásquez Herrera

**Institución:** Instituto Tecnológico Superior de Xalapa

**Carrera:** Ingeniería en Sistemas Computacionales

**Alumna:** Laura Irais García Saavedra

Implementación en Java de los algoritmos de ordenamiento **QuickSort** y **ShellSort**.

## ¿Qué hace cada método?

### QuickSort
Algoritmo basado en la estrategia **"Divide y Vencerás"**. Elige un elemento como **pivote** (en esta implementación, el último) y reorganiza el arreglo para que los menores queden a su izquierda y los mayores a su derecha (esquema de Lomuto). Después se repite el proceso de forma recursiva en cada mitad hasta que todo el arreglo queda ordenado.

### ShellSort
Es una mejora del **ordenamiento por inserción**. En lugar de comparar solo elementos vecinos, compara elementos separados por un **intervalo (gap)** que empieza en `n/2` y se reduce a la mitad en cada vuelta hasta llegar a 1. Así, los elementos que están muy lejos de su posición final se acomodan más rápido, y la última pasada (intervalo 1) encuentra el arreglo casi ordenado.

## Estructura del proyecto

```
src/Estructuras_Lineales/Unidad05y06/
├── QuickSort/
│   ├── QuickSort.java
│   └── Main.java
└── ShellSort/
    ├── ShellSort.java
    └── Main.java
```

## Requisitos

- Java JDK 8 o superior
- Git

## Clonar

```bash
git clone https://github.com/Lalis-707/QuickSort-ShellSort.git
cd QuickSort-ShellSort/src
```

## Compilar

```bash
javac Estructuras_Lineales/Unidad05y06/QuickSort/*.java
javac Estructuras_Lineales/Unidad05y06/ShellSort/*.java
```

## Ejecutar

```bash
java Estructuras_Lineales.Unidad05y06.QuickSort.Main
java Estructuras_Lineales.Unidad05y06.ShellSort.Main
```

## Salida esperada

QuickSort:

```
==========ARREGLO ORIGINAL:==========
[6, 1, 5, 8, 3, 2, 7, 4]

==========ARREGLO ORDENADO CON QUICKSORT:==========
[1, 2, 3, 4, 5, 6, 7, 8]
```

ShellSort:

```
==========ARREGLO ORIGINAL:==========
[6, 1, 5, 8, 3, 2, 7, 4]

==========ARREGLO ORDENADO CON SHELLSORT:==========
[1, 2, 3, 4, 5, 6, 7, 8]
```
