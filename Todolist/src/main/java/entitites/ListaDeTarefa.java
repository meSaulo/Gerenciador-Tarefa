/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

import java.util.List;
import entitites.Tarefa;
import java.util.ArrayList;


/**
 *
 * @author wasabi
 */
public class ListaDeTarefa {
    
      private String nome_lista; 
      private List<Tarefa> tarefas;
      
      
      public ListaDeTarefa(String nome_lista){
          
          this.nome_lista = nome_lista;
          this.tarefas = new ArrayList<>();
          tarefas.add(0,null);
          
      }
      
      public void adicionarTarefa(Tarefa tarefa){
          
          if(tarefa.getNome_tarefa().isBlank()){
              
             throw new IllegalArgumentException("nome da tarefa está vazio");
              
             
             
          } 
         
 
          
          if(tarefa.getDescricao_tarefa().isBlank()){
          
             throw new IllegalArgumentException("a descricão está vazia");
              
          }
          
          
          tarefas.add(tarefa);
          
      }
      
      public void removerTarefa(String nome_busca){
          
          Tarefa tarefaremove = null;
          
          for(int i = 1; i < tarefas.size(); i++){
              
              if(tarefas.get(i).getNome_tarefa().equalsIgnoreCase(nome_busca)){
                  
                 tarefaremove = tarefas.get(i);
                 break;
              
              }
              
          }
          
          if(tarefaremove != null){
              
              tarefas.remove(tarefaremove);
              System.out.println("Tarefa Removida com sucesso");
          
         
          }else{
              
              System.out.println("Tarefa Não Encontrada");
          
          }
         
          
          
      }
      
      
     
      public void editarTarefa(String nome, String novo_nome, String nova_descricao){
           
          for(int i = 1; i < tarefas.size(); i++){
          
              
              if(tarefas.get(i).getNome_tarefa().equalsIgnoreCase(nome)){
                  
                   if(novo_nome.isBlank() || nova_descricao.isBlank()){
                       
                      throw new IllegalArgumentException("novo nome ou nova descrição da tarefa estão vazias");
                   
                   }
                  
                   tarefas.get(i).setNome_tarefa(novo_nome); 
                   tarefas.get(i).setDescricao_tarefa(nova_descricao);
                   System.out.println("tarefa  atualizada"); 
                   return;
                   
                   
              }
          
          }
          
          System.out.println("tarefa não encontrada");
          
          
          
      }
      
      public void listarTarefa(){
          
          if(tarefas.isEmpty() || tarefas.size() == 1){
          
              System.out.println("A Lista Está vazia :-(");
              
          }else{
          
                for(int i = 1; i < tarefas.size(); i++){
                
                    tarefas.get(i).mostrarTarefa();
                    
                }
          }
          
      }
      
      
      public void imprimirListaSimples(){
          
          for(int i = 1; i < tarefas.size(); i++){
               
             
              if(tarefas.get(i).isPendente()){
                  
                System.out.println(i + " - " + "Nome Da Tarefa : " + tarefas.get(i).getNome_tarefa() );
                System.out.println(" ");
                  
              }
              
              
              
             
           
          
          }
      
      }
      
      
      public void mudarStatus(int n){
            
         
          
          if(n <= 0){
          
               throw new IllegalArgumentException("Comando Invalido");
          
          }else{
                 
          tarefas.get(n).setStatus_tarefa(StatusTarefa.CONCLUIDO);
          
          }
            
          
          
      }
      
         
         
          
          
          
          
      
    
          
   
      
      
}
