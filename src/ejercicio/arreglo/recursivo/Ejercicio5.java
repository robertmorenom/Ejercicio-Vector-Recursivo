package ejercicio.arreglo.recursivo;

//Cree un método recursivo que cuente los elementos de un arreglo que sean mayores a un número determinado.
//Use la siguiente firma de método:
//public int contarNumerosMayores(int[] arreglo, int numero)
public class Ejercicio5 {

    public int contarNumerosMayores(int[] arreglo, int numero) {
        return contarArregloMayoresRecursivo(arreglo, numero, 0);
    }

    private int contarArregloMayoresRecursivo(int[] arreglo, int numero, int index) {
        if (index == arreglo.length) {
            return 0;
        }
        if (arreglo[index] > numero) {
            return 1 + contarArregloMayoresRecursivo(arreglo, numero, index + 1);
        } else {
            return contarArregloMayoresRecursivo(arreglo, numero, index + 1);
        }

    }
}
