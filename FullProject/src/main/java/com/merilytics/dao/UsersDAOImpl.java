package com.merilytics.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.merilytics.bo.UsersBO;

@Named
public class UsersDAOImpl implements UsersDAO {

	@Resource
	private HibernateTemplate ht;

	@Override
	public UsersBO loginCheck(UsersBO bo) {
		try {
			SessionFactory sf = ht.getSessionFactory();
			Session session = sf.openSession();
			System.out.println("bo----"+bo);
			NativeQuery query = session
					.createNativeQuery("select BigIntToInt(count(1))  from users where email=:mail and password=:pwd");

			query.setParameter("mail", bo.getEmail());
			query.setParameter("pwd", bo.getPassword());
			List<Integer> id = query.list();
			System.out.println("id----------"+id);
			// List<Integer> id=(List<Integer>) ht.findByNamedQuery("query",new
			// Object[]{bo.getEmail(),bo.getPassword()});
			int check = (int) id.get(0);
			System.out.println("check-------" + check);
			if (check == 1) {
				System.out.println("in if condition ");
				return bo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
