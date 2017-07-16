package com.merilytics.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.merilytics.bo.UsersBO;
@Named
public class UsersDAOImpl implements UsersDAO {
	
	@Resource
	private HibernateTemplate ht;

	@Override
	public UsersBO loginCheck(UsersBO bo) {
	List id=ht.findByNamedQuery("query",new Object[]{bo.getEmail(),bo.getPassword()});
	int check=(int) id.get(0);
	if(check==1) return bo;
		return null;
	}

}
