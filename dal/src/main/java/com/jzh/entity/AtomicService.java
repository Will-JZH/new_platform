package com.jzh.entity;

public class AtomicService
{
	private Integer id;
	private String serviceName;
	private Float price;
	private Float procTime;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getServiceName()
	{
		return serviceName;
	}
	public void setServiceName(String serviceName)
	{
		this.serviceName = serviceName;
	}
	public Float getPrice()
	{
		return price;
	}
	public void setPrice(Float price)
	{
		this.price = price;
	}
	public Float getProcTime()
	{
		return procTime;
	}
	public void setProcTime(Float procTime)
	{
		this.procTime = procTime;
	}
}
