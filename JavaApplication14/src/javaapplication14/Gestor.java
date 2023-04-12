/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author anibal
 */
public class Gestor extends Funcionarios{

    private double bonificacao = 20;

    public Gestor(String nome, double salariobase, double salario, double bonusAnual) {
        super(nome, salariobase, salario, bonusAnual);
    }
   
    
  

    @Override
    public void calcularSalario(double valor) {
        this.setBonusAnual(0.10);
        valor = this.getSalariobase();
        valor = (this.getBonusAnual() + valor) / 100;
        this.setSalario(valor + bonificacao);
        
        
        return;
    }
    

    

  
    

    
}
