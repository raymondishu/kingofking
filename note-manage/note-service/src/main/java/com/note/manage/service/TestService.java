package com.note.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.manage.mapper.TestMapper;
import com.note.manage.pojo.Test;


@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	
	public List<Test> getTests(){
		return testMapper.queryMytest(1);
	}

}
