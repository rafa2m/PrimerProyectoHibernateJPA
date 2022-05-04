package org.primerproyecto.hibernate.jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Ejemplo de mapeo XML incluyendo una relación bidireccional
 * entre User y Phone
 * @author rafa
 * @version 1.0
 */
public class App 
{
	public static void main( String[] args )
	{
		//se utiliza el método de factoría de Persistence para crear el entity manager factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimerProyectoHibernateJPA");

		//gestor de entidades
		EntityManager em = emf.createEntityManager();

		//se inicia la transacción
		em.getTransaction().begin();    			
		
		//se crea el objeto User para guardar
		User user1 = new User();
		user1.setUserName("Rafa");
		user1.setUserMessage("Mensaje de Rafa");					
		
		//se crea el objeto Phone para guardar y asociar al
		//usuario creado anteriormente
		Phone phone1 = new Phone("123456789");
		user1.addPhone(phone1);
		//después de enviar el objeto al entitymanager se genera su id
		em.persist(phone1);
		phone1 = new Phone("987654321");
		user1.addPhone(phone1);
		//después de enviar el objeto al entitymanager se genera su id
		em.persist(phone1);
		//después de enviar el objeto al entitymanager se genera su id
		em.persist(user1);	
		
		//em.persist(phone1);

		em.flush();

		em.getTransaction().commit();

		em.close();
	}
}
