package com.jzh.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzh.dal.dao.AtomicServiceDao;
import com.jzh.entity.AtomicService;

@Controller
@RequestMapping("/main")
public class MainController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	@Autowired
	private AtomicServiceDao atomicServiceDao;
	
	@RequestMapping(value = "/serviceSearch", method = RequestMethod.POST)
	public @ResponseBody AtomicService getServiceInfo(@RequestBody Map<String, Object> params)
			throws Exception
	{
		String serviceName = params.get("serviceName").toString();
	
		AtomicService as = atomicServiceDao.getAtomicByServiceName(serviceName);
		LOGGER.info(as.getId().toString());
		return as;
	}

	
}
