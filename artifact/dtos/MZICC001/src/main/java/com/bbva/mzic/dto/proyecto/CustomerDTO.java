package com.bbva.mzic.dto.proyecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class CustomerDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */
    private int id;
	private String name;
	/**
	 * Get the Lastname attribute
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Set the Lastname attribute
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * Get the Fistname attribute
	 */
	public String getName() {
		return this.firstName;
	}

	/**
	 * Set the Fistname attribute
	 */
	public void setName(final String name) {
		this.name = name;
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
		final CustomerDTO rhs = (CustomerDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(id, rhs.id)
					.append(name, rhs.name)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.name)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("Id", id)
			.append("Name", name)
			.toString();
	}
}
