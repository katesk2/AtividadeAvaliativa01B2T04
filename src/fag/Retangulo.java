package fag;

public class Retangulo {
    private double largura;
    private double altura;

  
    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida! Deve ser maior que zero.");
        }
    }

   
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida! Deve ser maior que zero.");
        }
    }

   
    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }
}
