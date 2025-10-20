package fag;

public class Funcionario {
    private String nome;
    private double salario;

 
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    // Getter e Setter do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido! O nome não pode ser vazio.");
        }
    }

    // Getter e Setter do salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido! Deve ser maior ou igual a zero.");
        }
    }

  
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            double aumento = salario * (percentual / 100);
            salario += aumento;
        } else {
            System.out.println("Percentual inválido! Deve ser maior que zero.");
        }
    }
}
