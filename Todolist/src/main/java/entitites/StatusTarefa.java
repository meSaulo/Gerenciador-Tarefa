/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

/**
 *
 * @author Saulo
 */
public enum StatusTarefa {
    
    CONCLUIDO("Concluido"), PENDENTE("Pendente");
    
    
    private final String nome_status;
    
    private StatusTarefa(String nome_status){
    
        this.nome_status = nome_status;
    
    }
    
    
}
