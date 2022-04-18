package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.RequestHazardCentre;

@Component
public class RequestHazardCentreDAOImpl implements RequestHazardCentreDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addRequest(RequestHazardCentre hazardCentre) {
		// TODO Auto-generated method stub
        Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(hazardCentre);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public  RequestHazardCentre findRequest(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		RequestHazardCentre action=session.get(RequestHazardCentre.class, id);
		return action;
	}

	@Override
	public List<RequestHazardCentre> findAllRequest() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<RequestHazardCentre> Requestlist=session.createQuery("select i from RequestAction i").list();
		return Requestlist;
	}

	@Override
	public boolean updateRequest(RequestHazardCentre hazardCentre) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(hazardCentre);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteRequest(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		RequestHazardCentre hazardCentre=session.find(RequestHazardCentre.class, id);
		session.getTransaction().begin();
		session.update(hazardCentre);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}

