package dominio;

public class Pessoa {
	
	private int id;
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	public Pessoa(int id, String nome, int idade, double peso, double altura) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Método para listar as informações da pessoa
	public void listarPessoa() {
	       System.out.println("\nID: " + id);
	       System.out.println("Nome: " + nome);
	       System.out.println("Idade: " + idade);
	       System.out.println("Peso: " + peso);
	       System.out.println("Altura: " + altura);
	       
	       // Chama o método que calcula e imprime o IMC
	       System.out.println("IMC: " + calcularIMC());
	   }

	// Método para calcular o IMC
	public double calcularIMC() {
		return peso / (altura * altura);
	}
}
