package br.edu.fatecpg.polimorfismo.model;

public abstract class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo");
    }

    /*
     * Resposta:
     * A sobrescrita permite que as classes filhas (Carro e Bicicleta)
     * usem o mesmo método mover() da classe mãe (Veiculo), mas mudando
     * o que ele faz por dentro para que cada veículo se comporte do seu próprio jeito.
     */

}