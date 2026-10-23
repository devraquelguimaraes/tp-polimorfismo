package br.edu.fatepg.polimorfismo.view;

import br.edu.fatecpg.polimorfismo.model.*;

public class Main {
    public static void main(String[] args) {
        // Exercício 1
        // Resposta: A sobrescrita permite que Carro e Bicicleta usem o mesmo método mover() da mãe, mas cada um executando a sua própria mensagem.
        System.out.println("--- Exercício 1: Hierarquia de Veículos (Sobrescrita) ---");
        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();
        v1.mover();
        v2.mover();

        // Exercício 2
        // Resposta: A sobrecarga cria métodos de mesmo nome mudando os parâmetros na mesma classe. Já a sobrescrita altera um método que veio da classe mãe.
        System.out.println("\n--- Exercício 2: Calculadora (Sobrecarga) ---");
        Calculadora calc = new Calculadora();
        System.out.println("2 inteiros (10 + 20): " + calc.somar(10, 20));
        System.out.println("3 inteiros (5 + 15 + 30): " + calc.somar(5, 15, 30));
        System.out.println("2 doubles (12.5 + 7.8): " + calc.somar(12.5, 7.8));
    }
}