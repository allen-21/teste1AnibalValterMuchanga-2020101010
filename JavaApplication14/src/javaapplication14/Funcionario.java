/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author anibal
 */
public class Funcionario extends Funcionarios {

    public Funcionario(String nome, double salariobase, double salario, double bonusAnual) {
        super(nome, salariobase, salario, bonusAnual);
    }

    @Override
    public void calcularSalario(double valor) {
        this.setSalariobase(valor);
       this.setSalariobase(0.5);
       this.setSalario(valor * this.getSalario());
       
       
    }
    
    
}
