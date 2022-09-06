package br.com.empresa.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.empresa.loja.dao.CategoriaDao;
import br.com.empresa.loja.dao.ProdutoDao;
import br.com.empresa.loja.model.Categoria;
import br.com.empresa.loja.model.Produto;
import br.com.empresa.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		cadastrarProduto();		
		consultasComJpql();
	}

	/**
	 * Método que executa e exemplifica diversas consultas com JPQL
	 */
	private static void consultasComJpql() {
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		Produto p = produtoDao.buscarPorId(1l);
		System.out.println(p);
		
		List<Produto> todos = produtoDao.buscarTodos();
		todos.forEach(p1 -> System.out.println(p1+"\n"));
		
		List<Produto> todosNome = produtoDao.buscarPorNome("Xiaomi Redmi");
		todosNome.forEach(p1 -> System.out.println(p1+"\n"));
		
		List<Produto> todosCategoria = produtoDao.buscarPorNomeDaCategoria("CELULARES");
		todosCategoria.forEach(p1 -> System.out.println(p1+"\n"));
		
		BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
		System.out.println("Preço do produto: R$ "+precoDoProduto);
	}

	/**
	 * Cadastra, altera e excluí um produto.
	 */
	private static void cadastrarProduto() {
		Categoria categoria = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Celular Moderno de Excelente Qualidade.", new BigDecimal("800"),
				categoria);

		EntityManager em = JPAUtil.getEntityManager();
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ProdutoDao produtoDao = new ProdutoDao(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(categoria);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}

}
