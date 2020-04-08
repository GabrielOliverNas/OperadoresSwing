/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author gabriel.nascimento
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primeiroNumero = 3;
        int segundoNumero = 5;
        float media = (primeiroNumero + segundoNumero) / 2;

        System.out.println("A media vai ser %f " + media);

        int numero = 10;
        int valor = 4 + numero++;
        //aqui o resultado no console será 14, não 15 pois o incremento so vai ser usado depois da soma
        System.out.println("Test 1: " + valor);

        valor = 4 + ++numero;
        //aqui o resultado no console será 15, pois o incremento foi feito antes
        System.out.println("Teste 2: " + valor);

        // reiniciando o valor original, só para teste
        numero = 10;
        // Esse mais pode ser trocado por qualquer operador matematico 
        numero += 4;
        System.out.println(numero);

        float numeroAredondado = 8.9f;
        //arredondar para baixo
        int arredondar = (int) Math.floor(numeroAredondado);
        System.out.println("Arredondar para baixo: " + arredondar);

        numeroAredondado = 8.3f;
        arredondar = (int) Math.ceil(numeroAredondado);
        System.out.println("Arredondar para cima: " + arredondar);

        numeroAredondado = 8.5f;
        arredondar = (int) Math.round(numeroAredondado);
        System.out.println("Arredondar para cima a partir do segundo numero: " + arredondar);

        System.out.println(arredondar);
        
        //O menor numero que quisermos precisa estar no lugar do 5, o maior no lugar do 10
        double numeroAleatorio = Math.random();
        int numBetween = (int) (5 + numeroAleatorio + (10-5));
        System.out.println(numBetween);
    }

}
