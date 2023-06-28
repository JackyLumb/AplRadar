package aplradar;
import java.util.Scanner;
/**
 *
 * @author 00342589
 */
public class AplRadar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Interface com o usuário
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("Informe a Frequencia do Carro: ");
        float freqCarro = scan.nextFloat();
        System.out.print("Informe o limite de Velocidade: ");
        int limiteVelocidade = scan.nextInt();

        //Atributos: Variáveis
         Velocidade velocidade;

        //Valores iniciais
        velocidade = new Velocidade();

        //Processamento: Método
        velocidade.freqCarro = freqCarro;
        velocidade.limiteVelocidade = limiteVelocidade;

        //Saída: Exibição de Resultados
        velocidade.calcularMulta();
        
    }
    
}
