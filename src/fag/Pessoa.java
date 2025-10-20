package fag;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

  
    public Pessoa(String nome, double peso, double altura) {
        setNome(nome);
        setPeso(peso);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido! Não pode ser vazio.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido! Deve ser maior que 0.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida! Deve ser maior que 0.");
        }
    }

    // Método para calcular IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para classificar IMC
    public String classificacaoIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
