/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.todolist;

import java.util.Scanner;
import entitites.Tarefa;
import entitites.ListaDeTarefa;

/**
 *
 * @author Saulo
 */
public class Todolist {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        
        
        
        
        System.out.print("Digite o nome da sua lista de tarefas : ");
        String nome_lista = sc.nextLine();
        ListaDeTarefa lista = new ListaDeTarefa(nome_lista);
        
        
        
        exibirMenu();
        Integer op = 0;
        
        do{
            
        try{
            
         op = Integer.valueOf(sc.nextLine());

        
        }catch(NumberFormatException e){
        
            System.out.println("o Comando que você digitou foi invalido");
            
        }
               
        
        
        if(op == 1){
            
            try{
                
                criarTarefa(sc,lista);
                
            }catch(IllegalArgumentException e){
                 
                System.out.println("Erro ao efetuar o cadastro " + e.getMessage());
            }
            
            
        }
        
        
        if(op == 2){
            
            
            
            removerTarefa(sc,lista);
            
           
            
            
        
        }
        
        if(op == 3){
        
            try{
                editarTarefa(sc,lista);
            }catch(IllegalArgumentException e){
            
                System.out.println("Erro ao editar a tarefa : " + e.getMessage());
                
            }
            
        }
        
        
        if(op == 4){
        
            listar(lista);
        }
       
        
        
        if(op == 5){
            
            try{
                mudarStatus(lista,sc2);
            }catch(IllegalArgumentException e){
                
                System.out.println("Erro na mudança dos status " + e.getMessage());
                    
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Essa posição está vazia");
            }
            
            
           }
            
        
       }while(op != 6);
        
        
       
        
       
       
       
        
        
    }
    
    static void exibirMenu(){
    
        System.out.println("\n 1 - Criar Nova Tarefa \n 2 - Deletar  Tarefa \n 3 - Editar Tarefa \n 4 - Mostrar Lista \n 5 -Concluir Tarefa \n 6 - SAIR");
    
    
    
    }
    
    
    
    static void criarTarefa(Scanner leitor, ListaDeTarefa lista){
    
        
            
        System.out.print("Digite o nome da tarefa : ");
        String nome_tarefa = leitor.nextLine();
        
        
      
        System.out.print("Digite uma descrição para sua tarefa : ");
        String descricao_tarefa = leitor.nextLine();
       
        

        lista.adicionarTarefa(new Tarefa(nome_tarefa, descricao_tarefa));
        
        System.out.println("Tarefa Adicionado com sucesso");
        
        
    }
    
    static void removerTarefa(Scanner leitor, ListaDeTarefa lista){
            
           
        
            System.out.println("Digite o nome da tarefa que deseja remover");
            String nome_tarefa = leitor.nextLine();
            
            lista.removerTarefa(nome_tarefa);
            
    }
    
    static void editarTarefa(Scanner leitor, ListaDeTarefa lista){
    
            System.out.print("Digite a tarefa que deseja atualizar : ");
            String nome_tarefa = leitor.nextLine();
            
            
            System.out.print("Digite o novo nome : ");
            String novonome_tarefa = leitor.nextLine();
            
            System.out.print("digite a nova descrição : ");
            String novadescricao_tarefa = leitor.nextLine();
            
            lista.editarTarefa(nome_tarefa, novonome_tarefa, novadescricao_tarefa);
    }   
    
    
    static void listar(ListaDeTarefa lista){
    
            lista.listarTarefa();
        
    }
    
    static void mudarStatus(ListaDeTarefa lista, Scanner leitor){
           
           
         lista.imprimirListaSimples(); 
         
         System.out.println("Qual Tarefa Deseja Concluir");
         int numero_opc = leitor.nextInt();
        
        
         lista.mudarStatus(numero_opc);
         
         
        System.out.println("a tarefa foi concluida");
        
          
    }
    
   
    
    
    
    
    
}
