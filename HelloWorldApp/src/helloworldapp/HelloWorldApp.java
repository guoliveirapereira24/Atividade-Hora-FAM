/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gustavo de Oliveira Pereira
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        // TODO code application logic here
        
//        System.out.println("Hello World");

        Scanner leitor = new Scanner(System.in);
        
        Random random = new Random();
        int hora, minuto, escolha; // Define hora e minuto, e escolha como valores inteiros
      
        hora = 0;   //Define o valor de hora como 0
        minuto = 0; //Define o valor de minuto como 0
        escolha = 0;//Define o valor de escolha como 0
        
      
        
        // while == enquanto
        while(escolha >2 || escolha <1 ){ //Enquanto escolha for maior que 2 e menor que 1 o código não vai sair do while
            System.out.println("Digite 1 para hora aleatória ou 2 para escolher o horário.");
               escolha = leitor.nextInt();//A pessoa escreve no teclado a resposta, mas se a resposta não for um Inteiro da erro
               
               if(escolha >2 || escolha <1 ){ //Se a pessoa escrever um número diferente de 1 ou 2, entra nesse if
                    System.out.println("Por favor digite um número válido"); //Exibe a mensagem

               }
                
        } // Se escolha for maior que 2 ou menor que 1 o código volta pro while
            
            
            //Se o valor de escolha for igual a 1, o programa sorteará um horário
            if(escolha == 1){
                hora = random.nextInt(23); //sorteia um valor de 0 a 23 para a variavel hora 
                minuto = random.nextInt(59); // sorteia um valor de 0 a 59 para a variavel minuto
            }
            // Se o valor de escolha for igual a 2 a pessoa digitará uma hora e minuto
            else if(escolha == 2){
                System.out.println("Digite o valor da hora(sem os minutos).");
                hora = leitor.nextInt(); //A pessoa escreve no teclado a resposta, mas se a resposta não for um Inteiro da erro
                    while(hora >=24 || hora < 0){ //enquanto o valor de hora for maior ou igual a 24 ou menor que 0, o programa não sai do while
                        System.out.println("Digite uma hora válida.");//Exibe a mensagem
                        hora = leitor.nextInt();
                    }
            
                System.out.println("Digite o valor dos minutos.");
                minuto = leitor.nextInt(); //A pessoa escreve no teclado a resposta, mas se a resposta não for um Inteiro da erro
                    while(minuto >= 60 || minuto < 0){ //enquanto o valor de minuto for maior ou igual a 60 ou menor que 0, o programa não sai do while
                        System.out.println("Digite um minuto válido."); //Exibe a mensagem
                        minuto = leitor.nextInt();
                    }
            }
            
               
        
        
       
        DecimalFormat formatador = new DecimalFormat("00");// cria um formatador para que sempre o horário e minuto tenha 2 digitos
        String horaFormatada = formatador.format(hora); // aplica a formatação em hora, então se o valor for 5, passa a ser 05 e esse valor se torna uma String(texto)
        String minutoFormatado = formatador.format(minuto); // aplica a formatação em minuto, então se o valor for 9, passa a ser 09 e esse valor se torna uma String(texto
       
        String horaMinutoFormatada = String.format(horaFormatada + ":" + minutoFormatado); // unifica hora e minuto e adiciona o : no meio
        
        
        
        if (hora>6 && hora<12) { //Se o valor hora for maior que 6 e menor que 12 entra no if
           
            System.out.println("Bom dia, agora são " + horaMinutoFormatada + " horas." );       
        }
        else if (hora>=12 && hora<18){ // Se não entrar no if, ele testa pra ver se a hora é igual ou maior que 12 e menor que 18
            System.out.println("Boa tarde, agora são " + horaMinutoFormatada + " horas." );

        } else{ //Se nem o if nem o else if forem verdadeiros, ele roda o else obrigatóriamente

           System.out.println("Boa noite, agora são " + horaMinutoFormatada + " horas." );
        }
 
    }
    
}
// Faça um programa que crie um horário(hora e minutos) 
// E que entre as 6 e as 12 horas apareça uma mensagem de Bom dia e o horario
// Entre as 12 e 18 apareça uma mensagem de boa tarde e o horário e a partir desse horário apareça uma mensagem de Boa noite.
// OBS: O horário deve estar divido com :(dois ponto), exemplo: 03:43.