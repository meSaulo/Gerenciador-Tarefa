/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

import java.time.LocalDateTime;

/**
 *
 * @author Saulo
 */
public class Tarefa {
    
   private String nome_tarefa;
   private String descricao_tarefa;
   private final LocalDateTime data_tarefa;
   private StatusTarefa status_tarefa; 
  
  /// Construtor
   
  public Tarefa(String nome_tarefa, String descricao_tarefa){
      
      this.nome_tarefa = nome_tarefa;
      this.descricao_tarefa = descricao_tarefa;
      this.data_tarefa = LocalDateTime.now();
      this.status_tarefa = status_tarefa.PENDENTE;
      
  } 

    public String getNome_tarefa() {
        return nome_tarefa;
    }

    public String getDescricao_tarefa() {
        return descricao_tarefa;
    }

    public LocalDateTime getData_tarefa() {
        return data_tarefa;
    }

    public StatusTarefa getStatus_tarefa() {
        return status_tarefa;
    }

  
    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }

    public void setDescricao_tarefa(String descricao_tarefa) {
        this.descricao_tarefa = descricao_tarefa;
    }

    public void setStatus_tarefa(StatusTarefa status_tarefa) {
        this.status_tarefa = status_tarefa;
    }
    
    
    
    
    public void mostrarTarefa(){
        
        System.out.println("Nome : " + nome_tarefa + " \n" + "Descricão Da Tarefa : " + descricao_tarefa + " \n"
                           + "Data Efetuada da tarefa : " + data_tarefa + " \n" + " Situação : " + status_tarefa);
    
         System.out.println(" ");
    }
    
    public boolean isPendente(){
        
        if(status_tarefa == StatusTarefa.PENDENTE){
            return true;
        }
        
        return false;
        
    }
    
   
    
  
   
   
}
