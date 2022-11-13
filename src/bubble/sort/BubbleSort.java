package bubble.sort;

import java.util.List;

/**
 * Classe BubbleSort planejada para ser utilizada de forma estática com o propósito de prover o método de
 * ordenação do tipo bolha.
 */
public class BubbleSort {

    BubbleSort(){}

    /**
     * Método utilizado para realizar a ordenação do tipo bolha.
     * @param int[] list Lista de elementos a serem ordenados.
     * @return int[] lista ordenada pelo algoritmo.
     */
    public static int[] sort(int[] list){
        for (var i = 0; i < list.length - 1; i++){ // rodada
            for (var j = 1; j < list.length - i; j++){ // par
                if (list[j - 1] > list[j]){
                    var aux = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = aux;
                }
            }
        }
        return list;
    }
}
