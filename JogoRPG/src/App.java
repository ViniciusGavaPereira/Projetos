import java.util.Random;
import java.util.Scanner;
import java.util.Random;


public class App {

     

    static int ataqueUsuario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha seu ataque");
        System.out.println("(1) - Soco");
        System.out.println("(2) - Especial");

        return leitor.nextInt();
        
       
    }

    static int ataqueComputador(){
        Random gerador = new Random();
        return gerador.nextInt(3) + 1; //Retorna um número entre um e três.
    }

    static void imprimirHP(int hpUsuario, int hpComputador, int contagemEspecial){
        System.out.println("============================");
        System.out.println("- HP Usuário: " + hpUsuario);
        System.out.println("- Contagem de especiais: " + contagemEspecial);
        System.out.println("----------------------------");
        System.out.println("- HP Computador: " + hpComputador);
        System.out.println("============================");

    }


    static void batalha(){
        int hp = 150;
        int hpComputador = 11;
        int contagemEspecial = 5;
        int escolhaAtaque = 0;

        while(hp > 0 && hpComputador > 0){
           
            imprimirHP(hp, hpComputador,contagemEspecial);
            
            escolhaAtaque = ataqueUsuario();

            switch(escolhaAtaque){
                case 1: System.out.println("Soco");
                        hpComputador -= 7;
                break;

                case 2:  System.out.println("Ataque especial");
                        hpComputador -= 20;
                        contagemEspecial--;
                        System.out.println("Número de especiais: " + contagemEspecial);
                break;

                default:
                        System.out.println("Opção inválida");
                break;
            }

            if(hpComputador > 0){
                escolhaAtaque = ataqueComputador();

                switch(escolhaAtaque){
                    case 1: System.out.println("O inimigo te socou");
                            hp -= 2;
                    break;
    
                    case 2:  System.out.println("O inimigo te chutou");
                            hp -= 3;
                            contagemEspecial--;
                            System.out.println("Número de especiais: " + contagemEspecial);
                    break;
                    
                    case 3:  System.out.println("O inimigo te acertou com um golpe especial");
                            hp -= 5;
                    break;
                }
            }else{
                System.out.println("Inimigo derrotado");
            }
        }

    }
    public static void main(String[] args) throws Exception {
      
        Scanner leitor = new Scanner(System.in);

   

        int continua = 1;

        while(continua == 1){

            batalha();


            System.out.println("Fim de jogo, deseja continuar? \n(1) - Sim \n(2) - Não");
            continua = leitor.nextInt();
        }
      
        leitor.close();

   
    }
}