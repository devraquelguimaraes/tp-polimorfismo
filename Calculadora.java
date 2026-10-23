package br.edu.fatecpg.polimorfismo.model;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    /*
     * Resposta:
     * A sobrecarga é criar vários métodos com o mesmo nome na mesma classe,
     * mudando apenas os parâmetros (quantidade ou tipos).
     * A diferença é que a sobrecarga escolhe o método pelos parâmetros passados,
     * enquanto a sobrescrita muda o comportamento de um método herdado da classe mãe.
     */
}