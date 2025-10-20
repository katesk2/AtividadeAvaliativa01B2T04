package fag;

public class Filme {
    private String titulo;
    private double avaliacao;

    // Construtor 
    public Filme() {}

 
    public Filme(String titulo, double avaliacao) {
        setTitulo(titulo);
        setAvaliacao(avaliacao);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido! O título não pode ser vazio.");
        }
    }

    
    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao >= 0 && avaliacao <= 5) {
            this.avaliacao = avaliacao;
        } else {
            System.out.println("Avaliação inválida! Deve estar entre 0 e 5.");
        }
    }

   
    public void exibir() {
        System.out.println("Filme: " + titulo + " | Avaliação: " + avaliacao);
    }
}
