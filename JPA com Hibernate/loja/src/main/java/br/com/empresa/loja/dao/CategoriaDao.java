package br.com.empresa.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.empresa.loja.model.Categoria;
import br.com.empresa.loja.model.Produto;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Categoria categoria) {
    	this.em.persist(categoria);
    }
    
    public void atualizar(Categoria categoria) {
        this.em.merge(categoria);
    }
    
    public void remover(Categoria categoria) {
    	categoria = this.em.merge(categoria);
    	this.em.remove(categoria);
    }
    
    public Categoria buscarPorId(Long id) {
    	return this.em.find(Categoria.class, id);    	
    }
    
    public List<Categoria> buscarTodos(){
    	String sql = "SELECT c FROM Categoria c";
    	return this.em.createQuery(sql, Categoria.class).getResultList();
    }
}