/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplradar;

/**
 *
 * @author 00342589
 */
public class Velocidade {

    //Atributos - Váriaveis
    float freqCarro;
    int limiteVelocidade;

    //Entrada de Dados
    {
        limiteVelocidade = 120;
        freqCarro = 0.7f;
    }

    //Processamento
    float calcularVelocidadeCarro() {
        return ((1 / freqCarro) - 1) * 300;

    }

    float calcularPorcentagem() {
        if (calcularVelocidadeCarro() < limiteVelocidade) {
            return 0;
        } else {
            return ((limiteVelocidade - calcularVelocidadeCarro()) * 100) / limiteVelocidade;
        }
    }

    void calcularMulta() {
        if (calcularPorcentagem() == 0) {
            System.out.println("Velocidade do Carro (km/h):" + calcularVelocidadeCarro());
            System.out.println("Dentro do limite de Velocidade;");
        } else if (calcularPorcentagem() > 0 && calcularPorcentagem() <= 20) {
            System.out.println("Velocidade do Carro (km/h):" + calcularVelocidadeCarro());
            System.out.println("Infração Média (4 Pontos)");
            System.out.println("Multa de R$: 130,16.");
        } else if (calcularPorcentagem() >= 20 && calcularPorcentagem() <= 50) {
            System.out.println("Velocidade do Carro (km/h):" + calcularVelocidadeCarro());
            System.out.println("Infração Grave (5 Pontos)");
            System.out.println("Multa de R$: 195,23.");
        } else {
            System.out.println("Velocidade do Carro (km/h):" + calcularVelocidadeCarro());
            System.out.println("Infração Gravíssima (7 Pontos)");
            System.out.println("Multa de R$: 880,41.");
        }
    }

    //Saida de Dados
}
