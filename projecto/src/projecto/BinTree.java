package projecto;

public interface BinTree {
	
	public void inserir(int valor, String nome);
	
	public NoBinTree procurar(int valor);
	
	public boolean remover(int valor);
	
	public boolean editarNome(int valor, String nome);
	
}
