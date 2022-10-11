public class Main {
    
    public static void main(String[] args) {

	/**
	 * Criação de 3 usuários
	 * 
	 */
	ItemPermissao itemPermissao1 = new Usuario(1l, "Usuário 1");
	ItemPermissao itemPermissao2 = new Usuario(2l, "Usuário 2");
	ItemPermissao itemPermissao3 = new Usuario(3l, "Usuário 3");
	
	
	/**
	 * Criação de 3 grupos. O itemPermissao5 é um grupo 
	 * formado pelo grupo itemPermissao4 e pelo usuário itemPermissao3, portanto forma uma árvore
	 * 
	 */
	ItemPermissao itemPermissao4 = new Grupo(1l, "Grupo 4", itemPermissao1, itemPermissao2);
	ItemPermissao itemPermissao5 = new Grupo(1l, "Grupo 5", itemPermissao4, itemPermissao3);
	ItemPermissao itemPermissao6 = new Grupo(1l, "Grupo 6", itemPermissao3);
	
	
	/**
	 * Permissão TESTE1 concedido para o usuário itemPermissao1
	 */
	itemPermissao1.concederPermissao("TESTE0");
	
	/**
	 * Permissão TESTE1 concedido para o grupo itemPermissao4
	 */
	itemPermissao4.concederPermissao("TESTE1");
	
	
	/**
	 * Permissão TESTE2 concedido para o grupo itemPermissao5, consequentemente
	 * para todos os usuários da árvore
	 *
	 */
	itemPermissao5.concederPermissao("TESTE2");
	
	
	/**
	 * Permissão TESTE3 concedido para o grupo itemPermissao6
	 */
	itemPermissao6.concederPermissao("TESTE3");
    }
}
