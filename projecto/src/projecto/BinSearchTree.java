package projecto;

public class BinSearchTree implements BinTree {

    private NoBinTree raiz;

    // COMPLETAR os Metodos da Interface BinTree
    public BinSearchTree() {
         raiz = null;
    }

    @Override
    public void inserir(int valor, String nome) {
        raiz = inserir(raiz, valor, nome);
    }

    private NoBinTree inserir(NoBinTree raiz, int valor, String nome){
         if (raiz == null){
             raiz = new NoBinTree(valor, nome);
         } else {
             if (valor == raiz.getValor()) {
                 System.out.println("Erro! Esse Aluno já Existe!");
             }
             if (valor < raiz.getValor()) {
                 raiz.filhoEsquerda = inserir(raiz.filhoEsquerda, valor, nome);
             } else {
                 raiz.filhoDireita = inserir(raiz.filhoDireita, valor, nome);
             }
         }
         return raiz;
     }

    @Override
    public NoBinTree procurar(int valor) {

        NoBinTree atual = raiz;

        while(atual != null){
            if(atual.valor == valor){
                return atual;
            }else if(atual.valor > valor){
                atual = atual.filhoEsquerda;
            }else{
                atual = atual.filhoDireita;
            }
        }
        return atual;
    }

    @Override
    public boolean remover(int valor) {
    	NoBinTree atual = raiz;
    	NoBinTree pai = raiz;
    	
    	boolean esquerda = true;
    	
    	while(atual.valor != valor) {
    		pai = atual;
    		if(valor < atual.valor) {
    			esquerda = true;
    			atual=atual.filhoEsquerda;
    		} else {
    			esquerda = false;
    			atual = atual.filhoDireita;
    		}
    		
    		if (atual == null) {
        		return false;
        	}
    	}
    	
    	if(atual.filhoEsquerda == null && atual.filhoDireita == null){
    		if(atual == raiz) {
    			raiz = null;
    		}else if(esquerda) {
    			pai.filhoEsquerda = null;
    		}else {
    			pai.filhoDireita = null;
    		}
    	} else if(atual.filhoDireita == null){
    		if(atual == raiz) {
    			raiz = atual.filhoEsquerda;
    		}else if(esquerda) {
    			pai.filhoEsquerda = atual.filhoEsquerda;
    		}else {
    			pai.filhoDireita = atual.filhoEsquerda;
    		}
    	} else if(atual.filhoEsquerda == null) {
    		if(atual == raiz) {
    			raiz = atual.filhoDireita;
    		}else if(esquerda) {
    			pai.filhoEsquerda = atual.filhoDireita;
    		}else {
    			pai.filhoDireita = atual.filhoEsquerda;
    		}
    	} else {
    		NoBinTree troca = getNoTroca(atual);
    		
    		if(atual == raiz) {
    			raiz = troca;
    		} else if(esquerda){
    			pai.filhoEsquerda = troca;
    		} else {
    			pai.filhoDireita = troca;    			
    		}
    		troca.filhoEsquerda = atual.filhoEsquerda;
    	}
    	return true;
    }
    
    private NoBinTree getNoTroca(NoBinTree trocado) {
    	NoBinTree trocadoPai = trocado;
    	NoBinTree troca = trocado;
    	
    	NoBinTree atual = trocado.filhoDireita;
    	
    	while(atual != null) {
    		trocadoPai = troca;
    		troca = atual;
    		atual = atual.filhoEsquerda;
    	}
    	
    	if(troca != trocado.filhoDireita) {
    		trocadoPai.filhoEsquerda = troca.filhoDireita;
    		troca.filhoDireita = trocado.filhoDireita;
    	}
    	
    	return troca;
    }
    
    
    @Override
    public boolean editarNome(int valor, String nome) {
    	NoBinTree editor;
    	editor = procurar(valor);
    	
    	editor.nome = nome;
    	
    	return true;
    }

}