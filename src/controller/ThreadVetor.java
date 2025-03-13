package controller;

public class ThreadVetor extends Thread {
    private int num;
    private int[] vetor;

    public ThreadVetor(int num, int[] vetor) {
        this.num = num;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        long inicio = System.nanoTime(); // Captura o tempo inicial

        if (num % 2 == 0) { // Número Par - Percorre com For
            for (int i = 0; i < vetor.length; i++) {
                int valor = vetor[i]; // Apenas acessando o valor
            }
        } else { // Número Ímpar - Percorre com Foreach
            for (int valor : vetor) {
                // Apenas acessando o valor
            }
        }

        long fim = System.nanoTime(); // Captura o tempo final
        double tempoSegundos = (fim - inicio) / 1_000_000_000.0; // Converte para segundos

        System.out.println("Thread com número " + num + " executou em: " + tempoSegundos + " segundos.");
    }
}
