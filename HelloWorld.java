package ufrpe;

public class HelloWorld {
	private String nome;

	public void setNome(String nome) {
		this.nome = nome;	
	}
	public String getNome() {
		return nome;
	}
	
	Horario meuhorario = new Horario();
	
	public void imprimir() {
		System.out.println(meuhorario.getHorario()+" - "+"Ol� "+this.getNome()+". Voc� acabou de fazer o seu primeiro Hello World em Java. Parab�ns.");	
	}
}

