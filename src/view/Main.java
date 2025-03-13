package view;

import controller.ThreadVetor;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000]; // Vetor de 1000 posições
        Random random = new Random();

        // Preenchendo o vetor com valores aleatórios entre 1 e 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        // Criando e iniciando as Threads
        Thread t1 = new ThreadVetor(1, vetor); // Usará Foreach
        Thread t2 = new ThreadVetor(2, vetor); // Usará For

        t1.start();
        t2.start();
    }
}
