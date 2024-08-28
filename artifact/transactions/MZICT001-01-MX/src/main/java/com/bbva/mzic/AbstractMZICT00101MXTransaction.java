package com.bbva.mzic;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mzic.dto.proyecto.customerdto;
import com.bbva.mzic.dto.proyecto.letterdto;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMZICT00101MXTransaction extends AbstractTransaction {

	public AbstractMZICT00101MXTransaction(){
	}


	/**
	 * Return value for input parameter Name
	 */
	protected String getName(){
		return (String)this.getParameter("Name");
	}

	/**
	 * Return value for input parameter MZICC005
	 */
	protected customerdto getMzicc005(){
		return (customerdto)this.getParameter("MZICC005");
	}

	/**
	 * Return value for input parameter phone
	 */
	protected Long getPhone(){
		return (Long)this.getParameter("phone");
	}

	/**
	 * Return value for input parameter lastname
	 */
	protected String getLastname(){
		return (String)this.getParameter("lastname");
	}

	/**
	 * Return value for input parameter email
	 */
	protected String getEmail(){
		return (String)this.getParameter("email");
	}

	/**
	 * Set value for letterdto output parameter MZICC006
	 */
	protected void setMzicc006(final letterdto field){
		this.addParameter("MZICC006", field);
	}

	/**
	 * Set value for String output parameter name
	 */
	protected void setName(final String field){
		this.addParameter("name", field);
	}

	/**
	 * Set value for String output parameter lastname
	 */
	protected void setLastname(final String field){
		this.addParameter("lastname", field);
	}

	/**
	 * Set value for Long output parameter secuence
	 */
	protected void setSecuence(final Long field){
		this.addParameter("secuence", field);
	}

	/**
	 * Set value for Long output parameter phone
	 */
	protected void setPhone(final Long field){
		this.addParameter("phone", field);
	}
}
