package com.jzh.dal.dao;

import java.util.List;

import com.jzh.entity.AtomicService;
import com.jzh.entity.SumAtomicService;

public interface AtomicServiceDao
{
	AtomicService getAtomicByServiceName(String serviceName);

	AtomicService getAtomicByEnterpriseName(String serviceName);

	SumAtomicService sumPriceAndTime(List<String> services);
}
