package com.atguigu.atcrowdfunding.manager.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.manager.dao.TestDao;
import com.atguigu.atcrowdfunding.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao testDao;
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("name","zhangsan");
		testDao.insert(map);
	}

}
