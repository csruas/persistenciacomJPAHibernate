package br.com.alura.loja.DAO;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;

public class CategoriaDAO {
	private EntityManager em;

	public CategoriaDAO(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	
	public void atualizar(Categoria categoria) {
		this.em.merge(categoria);
	}
	

}
