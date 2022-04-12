package com.xworkz.product.dto;

public class PersonDTO {
	private String name;
	private double weigth;
	private boolean disabled;
	private boolean dead;
	public PersonDTO()
	{
		
	}
      public   void setName(String name)
    {
    	this.name=name;
    }
      public String getName()
      {
    	  return this.name;
      }
      public   void setWeight(double  weigth)
      {
      	this.weigth=weigth;
      }
        public double getWeight()
        {
      	  return this.weigth;
        }
        public void  setDisbaled(boolean disabled)
        {
        	this.disabled=disabled;
        }
        public boolean getDisabled()
        {
        	return this.disabled;
        }
        public void setDead(boolean dead)
        {
        	this.dead=dead;
        }
        public boolean isDead()
        {
        	return this.dead;
        }
}
