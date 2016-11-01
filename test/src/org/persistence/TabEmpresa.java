package org.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tab_empresa database table.
 * 
 */
@Entity
@Table(name="tab_empresa")
@NamedQuery(name="TabEmpresa.findAll", query="SELECT t FROM TabEmpresa t")
public class TabEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_id")
	private String empId;

	@Column(name="emp_dep_id")
	private String empDepId;

	@Column(name="emp_direccion")
	private String empDireccion;

	@Column(name="emp_email")
	private String empEmail;

	@Column(name="emp_est_id")
	private String empEstId;

	@Column(name="emp_fax")
	private String empFax;

	@Column(name="emp_fecha_creacion")
	private Timestamp empFechaCreacion;

	@Column(name="emp_fecha_modificacion")
	private Timestamp empFechaModificacion;

	@Column(name="emp_mun_id")
	private String empMunId;

	@Column(name="emp_nit")
	private String empNit;

	@Column(name="emp_nombre")
	private String empNombre;

	@Column(name="emp_observaciones")
	private String empObservaciones;

	@Column(name="emp_pagina_web")
	private String empPaginaWeb;

	@Column(name="emp_persona_contacto")
	private String empPersonaContacto;

	@Column(name="emp_telefono")
	private String empTelefono;

	@Column(name="emp_usuario_creacion")
	private String empUsuarioCreacion;

	@Column(name="emp_usuario_modificacion")
	private String empUsuarioModificacion;

	public TabEmpresa() {
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpDepId() {
		return this.empDepId;
	}

	public void setEmpDepId(String empDepId) {
		this.empDepId = empDepId;
	}

	public String getEmpDireccion() {
		return this.empDireccion;
	}

	public void setEmpDireccion(String empDireccion) {
		this.empDireccion = empDireccion;
	}

	public String getEmpEmail() {
		return this.empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpEstId() {
		return this.empEstId;
	}

	public void setEmpEstId(String empEstId) {
		this.empEstId = empEstId;
	}

	public String getEmpFax() {
		return this.empFax;
	}

	public void setEmpFax(String empFax) {
		this.empFax = empFax;
	}

	public Timestamp getEmpFechaCreacion() {
		return this.empFechaCreacion;
	}

	public void setEmpFechaCreacion(Timestamp empFechaCreacion) {
		this.empFechaCreacion = empFechaCreacion;
	}

	public Timestamp getEmpFechaModificacion() {
		return this.empFechaModificacion;
	}

	public void setEmpFechaModificacion(Timestamp empFechaModificacion) {
		this.empFechaModificacion = empFechaModificacion;
	}

	public String getEmpMunId() {
		return this.empMunId;
	}

	public void setEmpMunId(String empMunId) {
		this.empMunId = empMunId;
	}

	public String getEmpNit() {
		return this.empNit;
	}

	public void setEmpNit(String empNit) {
		this.empNit = empNit;
	}

	public String getEmpNombre() {
		return this.empNombre;
	}

	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}

	public String getEmpObservaciones() {
		return this.empObservaciones;
	}

	public void setEmpObservaciones(String empObservaciones) {
		this.empObservaciones = empObservaciones;
	}

	public String getEmpPaginaWeb() {
		return this.empPaginaWeb;
	}

	public void setEmpPaginaWeb(String empPaginaWeb) {
		this.empPaginaWeb = empPaginaWeb;
	}

	public String getEmpPersonaContacto() {
		return this.empPersonaContacto;
	}

	public void setEmpPersonaContacto(String empPersonaContacto) {
		this.empPersonaContacto = empPersonaContacto;
	}

	public String getEmpTelefono() {
		return this.empTelefono;
	}

	public void setEmpTelefono(String empTelefono) {
		this.empTelefono = empTelefono;
	}

	public String getEmpUsuarioCreacion() {
		return this.empUsuarioCreacion;
	}

	public void setEmpUsuarioCreacion(String empUsuarioCreacion) {
		this.empUsuarioCreacion = empUsuarioCreacion;
	}

	public String getEmpUsuarioModificacion() {
		return this.empUsuarioModificacion;
	}

	public void setEmpUsuarioModificacion(String empUsuarioModificacion) {
		this.empUsuarioModificacion = empUsuarioModificacion;
	}

}