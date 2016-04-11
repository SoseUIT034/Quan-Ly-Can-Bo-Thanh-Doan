package com.springmvc.qlcb.model;
// Generated Apr 11, 2016 10:54:37 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Controller generated by hbm2java
 */
@Entity
@Table(name = "controller", catalog = "qlcb")
public class Controller implements java.io.Serializable {

	private String controllerName;
	private Module module;
	private String controllerDisplayName;
	private Set<Privilege> privileges = new HashSet<Privilege>(0);

	public Controller() {
	}

	public Controller(String controllerName) {
		this.controllerName = controllerName;
	}

	public Controller(String controllerName, Module module, String controllerDisplayName, Set<Privilege> privileges) {
		this.controllerName = controllerName;
		this.module = module;
		this.controllerDisplayName = controllerDisplayName;
		this.privileges = privileges;
	}

	@Id

	@Column(name = "Controller_Name", unique = true, nullable = false, length = 32)
	public String getControllerName() {
		return this.controllerName;
	}

	public void setControllerName(String controllerName) {
		this.controllerName = controllerName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Module_Name")
	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@Column(name = "Controller_Display_Name", length = 254)
	public String getControllerDisplayName() {
		return this.controllerDisplayName;
	}

	public void setControllerDisplayName(String controllerDisplayName) {
		this.controllerDisplayName = controllerDisplayName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "controller")
	public Set<Privilege> getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

}