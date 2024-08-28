package com.bbva.mzic.dto.proyecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The AgendaDTO class...
 */
public class AgendaDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	private String lastName;

	private String firstName;

	private String email;

	private int phone;

	/**
	 * Get the Lastname attribute
	 */
	public String getlastName() {
		return this.lastName;
	}

	/**
	 * Set the Lastname attribute
	 */
	public void setlastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the Fistname attribute
	 */
	public String getfisrtName() {
		return this.firstName;
	}

	/**
	 * Set the Fistname attribute
	 */
	public void setfirstName(final String fistName) {
		this.fistName = fistName;
	}


	/**
	 * Get the Email attribute
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the Email attribute
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * Get the Phone attribute
	 */
	public int getPhone() {
		return this.phone;
	}

	/**
	 * Set the Phone attribute
	 */
	public void setPhone(final int phone) {
		this.phone = phone;
	}




	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final AgendaDTO rhs = (AgendaDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(lastName, rhs.lastName)
					.append(fisrtName, rhs.firstName)
					.append(phone, rhs.phone)
					.append(email, rhs.email)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.lastName)
			.append(this.firstName)
			.append(this.phone)
			.append(this.email)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("Lastname", lastName)
			.append("Firstname", firstName)
			.append("Phone", phone)
			.append("email", email)
			.toString();
	}
}
