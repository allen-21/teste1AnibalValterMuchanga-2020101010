/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author anibal
 */
public abstract class Funcionarios {
    private String nome;
    private double salarioBase;
    private double salario;
    private double bonusAnual;

    public Funcionarios(String nome, double salariobase, double salario, double bonusAnual) {
        this.nome = nome;
        this.salarioBase = salariobase;
        this.salario = salario;
        this.bonusAnual = bonusAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalariobase() {
        return salarioBase;
    }

    public void setSalariobase(double salariobase) {
        this.salarioBase = salariobase;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

  
    
    public abstract void calcularSalario(double valor);
    
  
    
}
