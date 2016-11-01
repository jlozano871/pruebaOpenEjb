package org.prueba.openejb.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.TabEmpresa;

/**
 * Session Bean implementation class SimpleStatelessEJB
 */
@Stateless
public class SimpleStatelessEJB implements SimpleStatelessEJBRemote, SimpleStatelessEJBLocal {

	@PersistenceContext(unitName="pruebaOpenEjb")
	private EntityManager em; 


	/**
	 * Default constructor. 
	 */
	public SimpleStatelessEJB() {
		// TODO Auto-generated constructor stub
	}



	public String getMensaje(){  
		List<TabEmpresa> lista = new ArrayList<TabEmpresa>();
		Query query = em.createQuery("Select e from TabEmpresa e");

		lista = query.getResultList();
		return "HOLA EJB - SimpleStateless listado primer registro = "+ lista.iterator().next().getEmpDepId();
	}


}
