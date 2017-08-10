package com.merilytics.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.merilytics.bo.UsersBO;
import com.merilytics.dao.UsersDAO;
import com.merilytics.dto.UsersDTO;
@Named
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersDAO dao;

	@Override
	public UsersDTO loginService(UsersDTO dto) {
		UsersBO bo=null;
		bo= new UsersBO();
		System.out.println("in service DTO"+dto);
		BeanUtils.copyProperties(dto, bo);
		System.out.println("in service"+bo);
		//use dao
	bo=	dao.loginCheck(bo);
if(bo!=null) {
	return dto;
}
return null;
		
	}

}
