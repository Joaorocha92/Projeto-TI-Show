package tishow;

import java.util.Scanner;

/**
 *
 * @author upper
 */
public class TIshow {
    static boolean continua = false;
    static int contador = 0;
    static int resposta = 0;
    static int pontos = 90;
    static int chances = 3;
    static Scanner leitor = new Scanner(System.in);
    //static int [] jaRespondeu;
    
    public static void main(String[] args) {
       
        inicioJogo();
        
       do{ 
           zeraTudo();
           jogada();
           zeraResposta();
           gameover();
           ganhou();
           
           jogarNovamente();
       }
       while(continua);
        
       fimDeJogo();
        
    }
    
    
    static void inicioJogo(){
        
        System.out.printf("\n Bem vindos ao Quiz do T.I Show \n "
                + "\n Regras: siga as instruções e não aperte nenhum número ou \n"
                + " caracter que não apareça no jogo! \n"
                + " se isso acontecer o jogo terminar! \n");
    }
    
    // Inicio das Perguntas //
    static int pergunta(){
        
        System.out.println("");
        System.out.println("Pergunta 1");
        System.out.println("");
        System.out.println("Como criar um repositório no git?");
        System.out.println("");
        System.out.println("1 - git status");
        System.out.println("2 - git push");
        System.out.println("3 - git add");
        System.out.println("4 - git init");
        
        System.out.printf("\nResposta: ");
        resposta = leitor.nextInt();
        
        return resposta;
    }
    
    static int pergunta2(){
               
        System.out.println("");
        System.out.println("Pergunta 2");
        System.out.println("");
        System.out.println("Como verificar o estado atual do repositório no git?");
        System.out.println("");
        System.out.println("1 - git remote");
        System.out.println("2 - git clone");
        System.out.println("3 - git status");
        System.out.println("4 - git pull");
        
        System.out.printf("\nResposta: ");
        resposta = leitor.nextInt();
        
        return resposta;
    }
    
    static int pergunta3(){
            
        System.out.println("");
        System.out.println("Pergunta 3");
        System.out.println("");
        System.out.println("O que é uma variável ?");
        System.out.println("");
        System.out.println("1 - um espaço alocado na memória");
        System.out.println("2 - um tipo de comando do git ");
        System.out.println("3 - sequência de passos lógicos");
        System.out.println("4 - aquilo que varia ");
        
        System.out.printf("\nResposta: ");
        resposta = leitor.nextInt();
        
        return resposta;
    }
    
    static int pergunta4(){
            
        System.out.println("");
        System.out.println("Pergunta 4");
        System.out.println("");
        System.out.println("Uma validação de uma entrada é que tipo de dado?");
        System.out.println("");
        System.out.println("1 - Lógico");
        System.out.println("2 - Inteiro");
        System.out.println("3 - String");
        System.out.println("4 - Real");
        
        System.out.printf("\nResposta: ");
        resposta = leitor.nextInt();
        
        return resposta;
    }
    
    static int opcao(int a){
          
        switch (resposta){
            
            case 1:                
            case 2:
            case 3:
                System.out.printf("\n*** Resposta errada *** \n");
                pontos = pontos - 30;
                chances = chances -1;
                         
            case 4:                 
                System.out.printf("\n*** Resposta correta! *** \n");
                pontos = pontos + 30; 
                break;
        }        
        return resposta;        
    }
    
    static int opcao2(int a){
          
            switch (resposta){
                case 3:
                    System.out.printf("\n*** Resposta correta! *** \n");
                    pontos = pontos + 30; 
                    break;
                case 1:
                case 2:
                case 4:
                    System.out.printf("\n*** Resposta errada *** \n");
                    pontos = pontos - 30;
                    chances = chances -1;
            }        
        return resposta;        
    }
    
    static int opcao3(int a){
          
            switch (resposta){
                case 1:
                    System.out.printf("\n*** Resposta correta! *** \n");
                    pontos = pontos + 30; 
                    break;
                
                case 2:
                case 3:    
                case 4:
                    System.out.printf("\n*** Resposta errada *** \n");
                    pontos = pontos - 30;
                    chances = chances -1;
            }        
        return resposta;        
    }
    
    static int opcao4(int a){
          
            switch (resposta){
                case 1:
                    System.out.printf("\n*** Resposta correta! *** \n");
                    pontos = pontos + 30; 
                    break;
                
                case 2:
                case 3:    
                case 4:
                    System.out.printf("\n*** Resposta errada *** \n");
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
    
    // zera todas variaveis globais para o valor inicial//
    static void zeraTudo(){
     contador = 0;
     resposta = 0;
     pontos = 90;
     chances = chances;
     continua = false; 
    }
    
    //imprime os pontos e as chances restantes//
    static void imprimiPontoEChances(){
        
        System.out.printf("\n-- Seus pontos: "+pontos + " --");
        System.out.println("");
        System.out.println("-- Suas chances: "+chances + " --");
        
    }
   
    static void jogada(){
       
         int a = 0;
         int b = 0;
         int ultimaQuestao = 0;
         int saiLoop = 0;
            // verifica as jogadas e quando as chances forem zero sai do loop e da game over//
            do{           
                                    
                                  
                  if(chances > 0 && pontos < 900){
                      
                    a = pergunta();                  
                    b = opcao(a);
                   imprimiPontoEChances(); 
                   }
                   
                  ultimaQuestao =ultimaQuestao + 1;
                    
                  if(chances > 0 && ultimaQuestao == 1 && pontos < 900){
                    b = zeraResposta();                

                    a = pergunta2();
                    b = opcao2(a);
                    imprimiPontoEChances();
                  }
                  
                   ultimaQuestao = ultimaQuestao + 1;
                  
                  if(chances > 0 && ultimaQuestao == 2 && pontos < 900){
                    b = zeraResposta();                

                    a = pergunta3();
                    b = opcao3(a);
                    imprimiPontoEChances();
                  }
                  
                  ultimaQuestao = ultimaQuestao + 1;
                  
                  if(chances > 0 && ultimaQuestao == 3 && pontos < 900){
                    b = zeraResposta();                

                    a = pergunta4();
                    b = opcao4(a);
                    imprimiPontoEChances();
                  }
                  
                  else{
                    break;
                  }  
                  
                  if(pontos == 900){
                      saiLoop = 1;
                  }
                
                // pega a variavel b com o valor da resposta e zera para receber o novo valor
                // de resposta da proxima pergunta//
                
            }while(saiLoop == 0);       
               
    }
    
    // verifica se o jogador perdeu!!!//
    static void gameover(){
       
        if (chances == 0){
            
                System.out.printf("\n*** GAME OVER!!! ***\n");
                chances = 3;          
        }
                
    }
    
    static void fimDeJogo(){
        System.out.println("");
        System.out.println("Fim de Jogo");
    }
    
    
    // verifica se o jogador ganhou!!!//
    static void ganhou(){
        
        if (pontos == 150){
            System.out.println("");
            System.out.println("**** Parabens você acertou todas as questões ****");
            System.out.println("");
        }
    }
    
    
    // Permite jogar novamente ou não//
    static int jogarNovamente(){
        int jogarDeNovo = 0;
            
           
               try{
                System.out.println("");
                System.out.println("// Deseja jogar novamente? //");
                System.out.println("");
                System.out.println("Sim aperte 1");
                System.out.println("Não aperte 2");
                int a = leitor.nextInt();

                if(a == 1){
                    jogarDeNovo = a;
                    continua = true;
                }
                else if(a == 2){
                    jogarDeNovo = a;
                    continua = continua;
                }else{
                
                    System.out.println("Número invalido");
                }
               
                
                 a = 0;
                
                }catch(Exception error){

                         // colocar tratamento de erro//
                        System.out.println("Número inválido!!! erro: "+error);

                }
           
            
        return jogarDeNovo;
    }
        
        
        
}
    
    
    
