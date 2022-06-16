package br.com.senaibrasilia.projetofinal.test;


import java.math.BigDecimal;


import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.dao.ProdutoDAO;

import br.com.senaibrasilia.projetofinal.model.Produto;
import br.com.senaibrasilia.projetofinal.util.JPAUtil;
public class Principal {

	public static void main(String[] args) {
		
		EntityManager em=JPAUtil.getEntityManager();
		ProdutoDAO pd=new ProdutoDAO(em);
		
		
		Produto p= new Produto("monitor","exibe video",new BigDecimal(300));
		
		
	
		
		em.getTransaction().begin();
		pd.cadastrar(p);
		pd.pesquisarTodos();
		em.getTransaction().commit();
		em.close();
		
		
	}

}
