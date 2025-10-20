package fag;

public class Temperatura {
    private double celsius;

 
    public Temperatura(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Valor inválido! Não pode ser menor que -273.15°C (zero absoluto).");
            this.celsius = -273.15;
        } else {
            this.celsius = celsius;
        }
    }

    // Getter
    public double getCelsius() {
        return celsius;
    }

   
    public double paraFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

  
    public double paraKelvin() {
        return celsius + 273.15;
    }

  
    public String toString() {
        return String.format("Celsius: %.2f°C | Fahrenheit: %.2f°F | Kelvin: %.2fK",
                celsius, paraFahrenheit(), paraKelvin());
    }
}
