package homework8.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import homework8.dao.NewsDao;
import homework8.entity.News;

public class NewsDaoImpl implements NewsDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void add(News news) {
		getSession().save(news);
	}

	

}
