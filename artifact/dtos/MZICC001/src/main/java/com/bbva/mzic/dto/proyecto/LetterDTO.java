package com.bbva.mzic.dto.proyecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class LetterDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */
	private String description;
    private int id;
    CreditDTO creditDTO = new CreditDTO();
	/**
	 * Get the Lastname attribute
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the Lastname attribute
	 */
	public void setDescription(final String descripcion) {
		this.description = description;
	}

// ID

	public String getId() {
		return this.id;
	}

	/**
	 * Set the Lastname attribute
	 */
	public void setId(final int id) {
		this.id = id;
	}

// CREDITDTO

	public String getCreditDTO() {
		return this.creditDTO;
	}

	/**
	 * Set the Lastname attribute
	 */
	public void setCreditDTO(final String creditDTO) {
		this.creditDTO = creditDTO;
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
		final LetterDTO rhs = (LetterDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(description, rhs.description)
                    .append(id, rhs.id)
                    .append(creditDTO, rhs.creditDTO)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.description)
            .append(this.id)
            .append(this.creditDTO)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("Description", description)
            .append("Id", id)
            .append("CreditDTO", creditDTO)
			.toString();
	}
}