package com.jzh.entity;

public class CompositeService
{
	private Integer id;
	private String serviceName;
	private Float totalPrice;
	private Float totalTime;
	
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
	public Float getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	public Float getTotalTime()
	{
		return totalTime;
	}
	public void setTotalTime(Float totalTime)
	{
		this.totalTime = totalTime;
	}
}
