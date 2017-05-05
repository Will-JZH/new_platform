package com.jzh.entity;

import java.util.Date;

public class SimulationFinished
{
	private Integer id;
	private String name;
	private Float cost;
	private Float processTime;
	private Float facilityUtilization;
	private Float resourceUtilization;
	private Float meanRepairTime;
	private String bottleneckAnalysis;
	private Integer completedQuantity;
	private Date deadline;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Float getCost()
	{
		return cost;
	}
	public void setCost(Float cost)
	{
		this.cost = cost;
	}
	public Float getProcessTime()
	{
		return processTime;
	}
	public void setProcessTime(Float processTime)
	{
		this.processTime = processTime;
	}
	public Float getFacilityUtilization()
	{
		return facilityUtilization;
	}
	public void setFacilityUtilization(Float facilityUtilization)
	{
		this.facilityUtilization = facilityUtilization;
	}
	public Float getResourceUtilization()
	{
		return resourceUtilization;
	}
	public void setResourceUtilization(Float resourceUtilization)
	{
		this.resourceUtilization = resourceUtilization;
	}
	public Float getMeanRepairTime()
	{
		return meanRepairTime;
	}
	public void setMeanRepairTime(Float meanRepairTime)
	{
		this.meanRepairTime = meanRepairTime;
	}
	public String getBottleneckAnalysis()
	{
		return bottleneckAnalysis;
	}
	public void setBottleneckAnalysis(String bottleneckAnalysis)
	{
		this.bottleneckAnalysis = bottleneckAnalysis;
	}
	public Integer getCompletedQuantity()
	{
		return completedQuantity;
	}
	public void setCompletedQuantity(Integer completedQuantity)
	{
		this.completedQuantity = completedQuantity;
	}
	public Date getDeadline()
	{
		return deadline;
	}
	public void setDeadline(Date deadline)
	{
		this.deadline = deadline;
	}
}
