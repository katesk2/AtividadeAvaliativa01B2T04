package fag;

public class Principal {
    public static void main(String[] args) {
        //atividadeUm(); 
    	//atividadeDois();
    	//atividadeTres();
    	//atividadeQuatro();
    	//atividadeCinco();
    	//atividadeSeis();
    	 //atividadeSete();
    	 //atividadeOito();
    	 //atividadeNove();
    	 //atividadeDez();
    }

    public static void atividadeUm() {
        ContaBancaria contaUm = new ContaBancaria("Kaua Tesk", 0);

        System.out.println("Saldo inicial: R$ " + contaUm.getSaldo());

        contaUm.depositar(1000);
        System.out.println("Após depósito: R$ " + contaUm.getSaldo());

        contaUm.sacar(500);
        System.out.println("Após saque: R$ " + contaUm.getSaldo());
    }
    
    public static void atividadeDois() {
        Filme filme1 = new Filme("Caramelo", 4.8);
        Filme filme2 = new Filme("Rio 2", 3.5);

        filme1.exibir();
        filme2.exibir();
    }
    
    public static void atividadeTres() {
        Funcionario funcionario = new Funcionario("Pedro Augusto", 2500.0);

        System.out.println("Salário antes do aumento: R$ " + funcionario.getSalario());

        funcionario.aumentarSalario(10); 

        System.out.println("Salário após aumento: R$ " + funcionario.getSalario());
    }

    
    public static void atividadeQuatro() {
        Retangulo ret = new Retangulo(5.0, 3.0);

        System.out.println("Largura: " + ret.getLargura());
        System.out.println("Altura: " + ret.getAltura());
        System.out.println("Área: " + ret.area());
        System.out.println("Perímetro: " + ret.perimetro());
    }
 
    public static void atividadeCinco() {
        Musica musica1 = new Musica("Gusttavo Lima - Retrovisor", 154); 
        Musica musica2 = new Musica("Hino do Palmeiras", 290); 

        System.out.println(musica1.getTitulo() + " - " + musica1.formatarDuracao());
        System.out.println(musica2.getTitulo() + " - " + musica2.formatarDuracao());
    }
    
    public static void atividadeSeis() {
        Pessoa pessoa1 = new Pessoa("Kauã Tesk", 69.5, 1.83);

        double imc = pessoa1.calcularIMC();
        String classificacao = pessoa1.classificacaoIMC();

        System.out.printf("%s possui IMC de %.2f - %s\n", pessoa1.getNome(), imc, classificacao);
    }

    public static void atividadeSete() {
        ContaLuz conta = new ContaLuz(250, 0.85); // 250 kWh a R$0,85 por kWh
        double valorTotal = conta.calcularValorTotal();

        System.out.printf("Consumo: %.2f kWh\nValor do kWh: R$ %.2f\nValor total a pagar: R$ %.2f\n",
                          conta.getConsumoKwh(), conta.getValorKwh(), valorTotal);
    }

    public static void atividadeOito() {
        BicicletaAlugada aluguel = new BicicletaAlugada(3, 20.50); 
        double valorFinal = aluguel.calcularValor();

        System.out.printf("Horas alugadas: %d\nValor por hora: R$ %.2f\nValor total: R$ %.2f\n",
                          aluguel.getHoras(), aluguel.getValorHora(), valorFinal);
    }
    
    public static void atividadeNove() {
      
        ProdutoEstoque produto = new ProdutoEstoque("Caneta", 20);

        produto.adicionarEstoque(5); // estoque = 25

     
        produto.removerEstoque(3); // estoque = 22

     
        produto.removerEstoque(32); // não altera

     
        System.out.printf("Produto: %s\nQuantidade final: %d\n", 
                          produto.getNome(), produto.getQuantidade());
    }

    
    public static void atividadeDez() {
        Temperatura temp1 = new Temperatura(25.0); 
        System.out.println("Temperatura normal:");
        System.out.println(temp1.toString());

        System.out.println("---------------------------");

        Temperatura temp2 = new Temperatura(-300.0);
        System.out.println("Temperatura inválida (teste de validação):");
        System.out.println(temp2.toString());
    }

}
