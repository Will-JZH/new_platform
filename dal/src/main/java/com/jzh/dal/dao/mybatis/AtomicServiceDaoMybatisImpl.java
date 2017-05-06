package com.jzh.dal.dao.mybatis;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.jzh.dal.dao.AtomicServiceDao;
import com.jzh.dal.dao.mappers.AtomicServiceMapper;
import com.jzh.entity.AtomicService;
import com.jzh.entity.SumAtomicService;

@Repository
public class AtomicServiceDaoMybatisImpl implements AtomicServiceDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(AtomicServiceDaoMybatisImpl.class);
	
	@Autowired
    private AtomicServiceMapper atomicServiceMapper;
	
	public AtomicService getAtomicByServiceName(String serviceName)
	{
		return atomicServiceMapper.getAtomicByServiceName(serviceName);
	}

	public AtomicService getAtomicByEnterpriseName(String serviceName)
	{
		return atomicServiceMapper.getAtomicByEnterpriseName(serviceName);
	}

	public SumAtomicService sumPriceAndTime(List<String> services)
	{
		return atomicServiceMapper.sumPriceAndTime(services);
	}
	
}
