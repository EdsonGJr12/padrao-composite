import java.util.HashSet;
import java.util.Set;

public class Usuario implements ItemPermissao {

	private Long id;
	private String nome;
	private Set<String> permissoes = new HashSet<>();

	public Usuario(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public void concederPermissao(String codigoPermissao) {
		this.permissoes.add(codigoPermissao);
	}
}
