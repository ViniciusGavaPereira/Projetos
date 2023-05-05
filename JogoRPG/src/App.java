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
        System.out.println("============================\n");

    }

    static int batalha(){
        int i = 1;
        int hp = 150;
        int hpComputador;
        int contagemEspecial = 5;
        int escolhaAtaque = 0;
        
        while(hp > 0){
            hpComputador = 10 + i;

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("INIMIGO: " + i);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

            while(hp > 0 && hpComputador > 0){


                imprimirHP(hp, hpComputador,contagemEspecial);
                
                escolhaAtaque = ataqueUsuario();
    
                switch(escolhaAtaque){
                    case 1: System.out.println("Soco");
                            hpComputador -= 7;
                    break;
    
                    case 2:  
                            if(contagemEspecial > 0){
                                System.out.println("Ataque especial");
                                hpComputador -= 20;
                                contagemEspecial--;
                                System.out.println("Número de especiais: " + contagemEspecial + "\n");

                            }else{
                                System.out.println("Seus especiais acabaram");
                                System.out.println("Soco");
                                hpComputador -= 7;
                            }

                            
                    break;
    
                    default:
                            System.out.println("Opção inválida");
                    break;
                }
    
                if(hpComputador > 0){
                    escolhaAtaque = ataqueComputador();
    
                    switch(escolhaAtaque){
                        case 1: System.out.println("O inimigo te socou");
                                hp -= 2 + (int)(i/10);
                        break;
        
                        case 2:  System.out.println("O inimigo te chutou");
                                hp -= 3 + (int)(i/10);
                                contagemEspecial--;
                                System.out.println("Número de especiais: " + contagemEspecial);
                        break;
                        
                        case 3:  System.out.println("O inimigo te acertou com um golpe especial");
                                hp -= 5 + (int)(i/20);
                        break;
                    }
                }else{
                    System.out.println("INIMIGO DERROTADO");
                    
                }
    
            }

            if(hp > 0){
                hp += 5;
                if(hp > 150){
                    hp = 150;
                }
                if(i % 10 == 0){
                    contagemEspecial++;
                    if(contagemEspecial > 5){
                        contagemEspecial = 5;
                    }
                }

                i++;
            }
        }

        return i;

    }
    public static void main(String[] args) throws Exception {
      
        Scanner leitor = new Scanner(System.in);
        int recorde = 0;
   

        int continua = 1;

        while(continua == 1){

            int pontos = batalha();
            System.out.println("Usuário chegou a: " + pontos + " inimigos derrotados.");

            if( pontos > recorde){
                recorde = pontos;
            }

            System.out.println("RECORDE: " + recorde + " inimigos derrotados.\n");

            System.out.println("Fim de jogo, deseja continuar? \n(1) - Sim \n(2) - Não");
            continua = leitor.nextInt();
        }
      
        leitor.close();

   
    }
}