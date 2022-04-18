package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Report;

@Component
public class ReportDAOImpl  implements ReportDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addReport(Report) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(centre);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Report findInjury(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Report centre=session.get(Report.class, id);
		return centre;
		
	}

	@Override
	public List<Report> findAllReport() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<InjuryCentre> personlist=session.createQuery("select Report").list();
		return personlist;
	}

	@Override
	public boolean updateReport(Report) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(session);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Overrde
	public boolean deleteReport(Report) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(session);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}

