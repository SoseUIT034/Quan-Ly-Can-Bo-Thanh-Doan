package com.springmvc.qlcb.model;
// Generated Apr 25, 2016 2:33:53 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

/**
 * Trinhdochinhtri generated by hbm2java
 */
@Entity
@Table(name = "trinhdochinhtri", catalog = "qlcb")
public class Trinhdochinhtri implements java.io.Serializable {

	private int maTrinhDoChinhTri;
	@Length(min=1, max=50, message="Không bỏ trống")
	private String tenTrinhDoChinhTri;
	private Set<Lylich> lyliches = new HashSet<Lylich>(0);

	public Trinhdochinhtri() {
	}

	public Trinhdochinhtri(int maTrinhDoChinhTri, String tenTrinhDoChinhTri) {
		this.maTrinhDoChinhTri = maTrinhDoChinhTri;
		this.tenTrinhDoChinhTri = tenTrinhDoChinhTri;
	}

	public Trinhdochinhtri(int maTrinhDoChinhTri, String tenTrinhDoChinhTri, Set<Lylich> lyliches) {
		this.maTrinhDoChinhTri = maTrinhDoChinhTri;
		this.tenTrinhDoChinhTri = tenTrinhDoChinhTri;
		this.lyliches = lyliches;
	}

	@Id

	@Column(name = "MaTrinhDoChinhTri", unique = true, nullable = false)
	public int getMaTrinhDoChinhTri() {
		return this.maTrinhDoChinhTri;
	}

	public void setMaTrinhDoChinhTri(int maTrinhDoChinhTri) {
		this.maTrinhDoChinhTri = maTrinhDoChinhTri;
	}

	@Column(name = "TenTrinhDoChinhTri", nullable = false, length = 200)
	public String getTenTrinhDoChinhTri() {
		return this.tenTrinhDoChinhTri;
	}

	public void setTenTrinhDoChinhTri(String tenTrinhDoChinhTri) {
		this.tenTrinhDoChinhTri = tenTrinhDoChinhTri;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trinhdochinhtri")
	public Set<Lylich> getLyliches() {
		return this.lyliches;
	}

	public void setLyliches(Set<Lylich> lyliches) {
		this.lyliches = lyliches;
	}

}
