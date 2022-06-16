package br.com.senaibrasilia.projetofinal.dao;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.model.Categoria;

public class CategoriaDAO {

	private EntityManager em;
	
	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {
		
		em.persist(categoria);
		
	}
	
	public void altualizar(Categoria categoria) {
		em.merge(categoria);
	}
	
	public void remover(Categoria categoria) {
		categoria = em.merge(categoria);
		this.em.remove(categoria);
	}
	/*
	public Categoria pesquisarPorCodigo(Long id) {
		return em.find(Categoria, id);
	}
	
	public void pesquisarPorNome() {
		//?
	}
	
	public void pesquisarTodos() {
		//query - JPQL
		//ArrayList-List
		//Lambda - Java8
	}
	*/
}
