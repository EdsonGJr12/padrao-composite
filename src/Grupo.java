import java.util.ArrayList;
import java.util.List;

public class Grupo implements ItemPermissao {
    private Long id;
    private String nome;
    private List<ItemPermissao> itensPermissao;
    
    public Grupo(Long id, String nome, ItemPermissao... itensPermissao) {
	this.id = id;
	this.nome = nome;
	if (itensPermissao == null) {
	    this.itensPermissao = new ArrayList<>();
	} else {
	    this.itensPermissao = List.of(itensPermissao);
	}
    }
    
    @Override
    public void concederPermissao(String codigoPermissao) {
	this.itensPermissao.forEach(itemPermissao ->  itemPermissao.concederPermissao(codigoPermissao));
    }
    
    public Long getId() {
	return id;
    }
    
    public String getNome() {
	return nome;
    }
    
}
