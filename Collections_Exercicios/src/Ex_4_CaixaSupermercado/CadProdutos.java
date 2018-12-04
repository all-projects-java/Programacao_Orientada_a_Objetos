package Ex_4_CaixaSupermercado;

import java.util.*;

public class CadProdutos{
    private Map<Integer,Produto> produtos;
    
    public CadProdutos(){
        produtos = new HashMap<>();
    }
    
    public void add(Produto prod){
        produtos.put(prod.getCodigo(),prod);
    }
    
    public Produto getProduto(int cod){
        return(produtos.get(cod));
    }
}

