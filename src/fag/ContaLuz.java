package fag;

public class ContaLuz {
    private double consumoKwh;
    private double valorKwh;

   
    public ContaLuz(double consumoKwh, double valorKwh) {
        setConsumoKwh(consumoKwh);
        setValorKwh(valorKwh);
    }

   
    public double getConsumoKwh() {
        return consumoKwh;
    }

    public void setConsumoKwh(double consumoKwh) {
        if (consumoKwh > 0) {
            this.consumoKwh = consumoKwh;
        } else {
            System.out.println("Consumo inválido! Deve ser maior que 0.");
        }
    }

    public double getValorKwh() {
        return valorKwh;
    }

    public void setValorKwh(double valorKwh) {
        if (valorKwh > 0) {
            this.valorKwh = valorKwh;
        } else {
            System.out.println("Valor do kWh inválido! Deve ser maior que 0.");
        }
    }

   
    public double calcularValorTotal() {
        return consumoKwh * valorKwh;
    }
}
