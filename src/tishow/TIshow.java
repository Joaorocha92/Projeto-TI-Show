
package tishow;

import java.util.Scanner;

/**
 *
 * @author upper
 */
public class TIshow {
    
    static int contador = 0;
    static int resposta = 0;
    static int pontos = 630;
    static int chances = 2;
    static Scanner leitor = new Scanner(System.in);
    static int [] jaRespondeu;
    
    public static void main(String[] args) {
        
        jogada();
        zeraResposta();
        gameover();
          
        
    }
    
    static int pergunta(){
        int num = 1;       
        System.out.println("Pergunta 1");
        System.out.println("");
        System.out.println("Qual o valor de PI");
        System.out.println("");
        System.out.println("1 - 3,14");
        System.out.println("2 - 5,55");
        System.out.println("3 - 10,14");
        System.out.println("4 - 13,04");
        
        System.out.print("Resposta: ");
        resposta = leitor.nextInt();
        
        return resposta;
    }
    
    static int pergunta2(){
        int num = 2;       
        
        System.out.println("Pergunta 2");
        System.out.println("");
        System.out.println("Quem descobriu o brasil");
        System.out.println("");
        System.out.println("1 - borba gato");
        System.out.println("2 - pedro alvares");
        System.out.println("3 - julio cesar");
        System.out.println("4 - colombo");
        
        System.out.print("Resposta: ");
        resposta = leitor.nextInt();
        
        return resposta;
    }
    
    static int opcao(int a){
          
        switch (resposta){
            
            case 1:
                System.out.println("Resposta correta!");
                pontos = pontos + 30; 
                break;
            case 2:
            case 3:
            case 4:    
                System.out.println("Resposta errada");
                
            pontos = pontos - 30;
            chances = chances -1;
            
        }
        
        return resposta;
        
    }
    
    static int opcao2(int a){
          
        switch (resposta){
            
            case 2:
                System.out.println("Resposta correta!");
                pontos = pontos + 30; 
                break;
            case 1:
            case 3:
            case 4:    
                System.out.println("Resposta errada");
                
            pontos = pontos - 30;
            chances = chances -1;
            
        }
        
        return resposta;
        
    }
    
    // zera a resposta para receber um novo valor//
    static int zeraResposta(){
        resposta = 0;
        return resposta;        
    }
    
    //imprime os pontos e as chances restantes//
    static void imprimiPontoEChances(){
        
        System.out.println("Seus pontos: "+pontos);
        System.out.println("");
        System.out.println("Suas chances: "+chances);
        
    }

    
    static int[] vetor(int[] jaRespondeu){
        
        jaRespondeu = new int[20];
        
        return jaRespondeu;
    }
    
    static int  verificacao(int a){
        
        if(jaRespondeu[1] == 1){
            
        }        
        return a;        
    }
    
    static void jogada(){
       
        // verifica as jogadas e quando as chances forem zero sai do loop e da game over//
        while( contador  < chances ){
            
            int a = pergunta();
            int b = opcao(a);
            imprimiPontoEChances();
            
            // pega a variavel b com o valor da resposta e zera para receber o novo valor
            // de resposta da proxima pergunta//
            b = zeraResposta();
            
            a = pergunta2();
            b = opcao2(a);
            imprimiPontoEChances();
            
        }
               
    }
    
    // verifica se o jogador perdeu!!!//
    static void gameover(){
       
        if (pontos <= 0 || chances == 0){
            
                System.out.println("Game Over!!!");
        }
                
    }
    
    
    // verifica se o jogador ganhou!!!//
    static void ganhou(){
        
        if (pontos == 690){
            
            System.out.println("Parabens você acertou todas as questões");
            System.out.println("");
            System.out.println("Seus pontos: "+pontos);
            System.out.println("Suas chances: "+chances);
        }
    }
    
    static int zeraVariavel (){
        
        int a = 0;
        
        return a;
    }
    
}
