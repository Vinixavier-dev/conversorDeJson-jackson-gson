package br.com.alura.contador.service;

public class Contador {

    public int contagem(int numero) {
        int i = 1;

        while (i <= numero) {
            System.out.print(i + " ");
            i++;
        }
        return numero;
    }
}
