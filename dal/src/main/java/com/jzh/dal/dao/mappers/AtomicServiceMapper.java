package com.jzh.dal.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jzh.entity.AtomicService;
import com.jzh.entity.SumAtomicService;

public interface AtomicServiceMapper
{
	AtomicService getAtomicByServiceName(@Param("serviceName") String serviceName);
	
	AtomicService getAtomicByEnterpriseName(@Param("serviceName") String serviceName);
	
	SumAtomicService sumPriceAndTime(@Param("services") List<String> services);
}
