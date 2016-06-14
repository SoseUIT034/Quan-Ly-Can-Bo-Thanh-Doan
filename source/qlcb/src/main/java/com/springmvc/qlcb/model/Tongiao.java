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
 * Tongiao generated by hbm2java
 */
@Entity
@Table(name = "tongiao", catalog = "qlcb")
public class Tongiao implements java.io.Serializable {

	private int maTonGiao;
	@Length(min=1, max=50, message="Không để trống")
	private String tenTonGiao;
	private Set<Lylich> lyliches = new HashSet<Lylich>(0);

	public Tongiao() {
	}

	public Tongiao(int maTonGiao, String tenTonGiao) {
		this.maTonGiao = maTonGiao;
		this.tenTonGiao = tenTonGiao;
	}

	public Tongiao(int maTonGiao, String tenTonGiao, Set<Lylich> lyliches) {
		this.maTonGiao = maTonGiao;
		this.tenTonGiao = tenTonGiao;
		this.lyliches = lyliches;
	}

	@Id

	@Column(name = "MaTonGiao", unique = true, nullable = false)
	public int getMaTonGiao() {
		return this.maTonGiao;
	}

	public void setMaTonGiao(int maTonGiao) {
		this.maTonGiao = maTonGiao;
	}

	@Column(name = "TenTonGiao", nullable = false, length = 200)
	public String getTenTonGiao() {
		return this.tenTonGiao;
	}

	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tongiao")
	public Set<Lylich> getLyliches() {
		return this.lyliches;
	}

	public void setLyliches(Set<Lylich> lyliches) {
		this.lyliches = lyliches;
	}

}
