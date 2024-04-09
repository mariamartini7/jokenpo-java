import java.util.Scanner;

public class Game{
    public static void main (string [] args){
        Scanner teclado = new Scanner(System.in);
            int jogador, computador;
        System.out.println("Pedra, Papel e Tesoura");
        System.out.println("");
        System.out.println(" 1-Pedra");
        System.out;println(" 2-Papel");
        System.out.println(" 3-Tesoura");
        System.out.println("Escolha a opção desejada");

        //jogador

        jogador = teclado.nextInt();
            switch(jogador) {
                case 1:
                    System.out.println("Jogador escolheu PEDRA");
                    break;
                case 2:
                    System.out.println("Jogador escolheu PAPEL");
                    break;
                case 3:
                    System.out.println("Jogador escolheu TESOURA");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        //Computador

        computador =(int)(Math.random()* 3 + 1);
        teclado.close();
            switch(computador){
                case 1:
                    System.out.println("Computador escolheu PEDRA");
                    break;
                case 2:
                    System.out.println("Computador escolheu PAPEL");
                    break;
                case 3:
                    System.out.println("Computador escolheu TESOURA");
                    break;
            }

        //Ganhador

        System.out.println("");
            if(jogador == computador){
                System.out.println("EMPATE");
            }else{
                if((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
                    System.out.println("JOGADOR VENCEU!!! <3");
                }else{ 
                    System.out.println("COMPUTADOR VENCEU!!! :)");
                    
         }

       }
    }
}