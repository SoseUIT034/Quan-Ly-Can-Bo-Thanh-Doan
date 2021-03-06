package com.springmvc.qlcb.model;
// Generated Apr 25, 2016 2:33:53 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CanboBanId generated by hbm2java
 */
@Embeddable
public class CanboBanId implements java.io.Serializable {

	private int idban;
	private int idcanBo;

	public CanboBanId() {
	}

	public CanboBanId(int idban, int idcanBo) {
		this.idban = idban;
		this.idcanBo = idcanBo;
	}

	@Column(name = "IDBan", nullable = false)
	public int getIdban() {
		return this.idban;
	}

	public void setIdban(int idban) {
		this.idban = idban;
	}

	@Column(name = "IDCanBo", nullable = false)
	public int getIdcanBo() {
		return this.idcanBo;
	}

	public void setIdcanBo(int idcanBo) {
		this.idcanBo = idcanBo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CanboBanId))
			return false;
		CanboBanId castOther = (CanboBanId) other;

		return (this.getIdban() == castOther.getIdban()) && (this.getIdcanBo() == castOther.getIdcanBo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdban();
		result = 37 * result + this.getIdcanBo();
		return result;
	}

}
