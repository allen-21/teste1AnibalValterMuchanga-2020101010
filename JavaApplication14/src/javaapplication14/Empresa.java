/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author anibal
 */
import java.util.ArrayList;

public class Empresa {
    
    private static ArrayList <Funcionarios > f = new ArrayList <>();
     //Metodo get

    public static ArrayList<Funcionarios> getListaLivros() {
        return f;
    }
    
    private ArrayList<Funcionarios> funcionario;
    private double despesasFixasMensais = 800000;

    public Empresa(double despesasFixasMensais) {
        this.funcionario = new ArrayList<>();
        this.despesasFixasMensais = despesasFixasMensais;
    }

    public void cadastrarFuncionario(Funcionarios funcionario) {
        this.funcionario.add(funcionario);
    }
    public void cadastrarGestor(Funcionarios Gestor){
        this.funcionario.add(Gestor);
    }
      public void cadastrarDiretor(Funcionarios Diretor){
        this.funcionario.add(Diretor);
    }
    
    

    public double calcularLucros() {
        double salariosTotais = 0.0;
        for (Funcionarios funcionario : this.funcionario) {
            salariosTotais += funcionario.getSalario();
        }
        return salariosTotais - this.despesasFixasMensais;
    }
    
     //remover um livro pelo titulo
    
 static public boolean remover (String Nome){
        for(Funcionarios f : f){
            if (f.getNome().equalsIgnoreCase(Nome)){
               
                return true;
            }
        }
        return false;
    }
    
}
