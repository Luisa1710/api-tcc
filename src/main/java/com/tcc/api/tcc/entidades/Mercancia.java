package com.tcc.api.tcc.entidades;

import javax.persistence.*;

@Entity
@Table(name = "mercancias")
public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iup")
    private Integer iup;
    @Column(name = "id_remitente")

    private String idRemitente;
    @Column(name = "nombre_remitente")

    private String nombreRemitente;
    @Column(name = "departamento_remitente")

    private String departamentoRemitente;
    @Column(name = "municipio_remitente")

    private String municipioRemitente;
    @Column(name = "tipo_remitente")

    private Boolean tipoRemitente;
    @Column(name = "dirrecion_remitente")

    private String dirrecionRemitente;
    @Column(name = "telefono_remitente")

    private String telefonoRemitente;
    @Column(name = "id_destinatario")

    private String idDestinatario;
    @Column(name = "nombre_destinatario")

    private String nombreDestinatario;
    @Column(name = "departamento_destinatario")

    private String departamentoDestinatario;
    @Column(name = "municipio_destinatario")

    private String municipioDestinatario;
    @Column(name = "tipo_destinatario")

    private Boolean tipoDestinatario;
    @Column(name = "dirrecion_destinatario")

    private String dirrecionDestinatario;
    @Column(name = "telefono_destinatar")

    private String telefonoDestinatar;
    @Column(name = "peso")

    private Double peso;
    @Column(name = "estado")

    private String estado;


    public Mercancia() {


    }

    public Integer getIup() {
        return iup;
    }

    public void setIup(Integer iup) {
        this.iup = iup;
    }

    public String getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(String idRemitente) {
        this.idRemitente = idRemitente;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getDepartamentoRemitente() {
        return departamentoRemitente;
    }

    public void setDepartamentoRemitente(String departamentoRemitente) {
        this.departamentoRemitente = departamentoRemitente;
    }

    public String getMunicipioRemitente() {
        return municipioRemitente;
    }

    public void setMunicipioRemitente(String municipioRemitente) {
        this.municipioRemitente = municipioRemitente;
    }

    public Boolean getTipoRemitente() {
        return tipoRemitente;
    }

    public void setTipoRemitente(Boolean tipoRemitente) {
        this.tipoRemitente = tipoRemitente;
    }

    public String getDirrecionRemitente() {
        return dirrecionRemitente;
    }

    public void setDirrecionRemitente(String dirrecionRemitente) {
        this.dirrecionRemitente = dirrecionRemitente;
    }

    public String getTelefonoRemitente() {
        return telefonoRemitente;
    }

    public void setTelefonoRemitente(String telefonoRemitente) {
        this.telefonoRemitente = telefonoRemitente;
    }

    public String getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(String idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDepartamentoDestinatario() {
        return departamentoDestinatario;
    }

    public void setDepartamentoDestinatario(String departamentoDestinatario) {
        this.departamentoDestinatario = departamentoDestinatario;
    }

    public String getMunicipioDestinatario() {
        return municipioDestinatario;
    }

    public void setMunicipioDestinatario(String municipioDestinatario) {
        this.municipioDestinatario = municipioDestinatario;
    }

    public Boolean getTipoDestinatario() {
        return tipoDestinatario;
    }

    public void setTipoDestinatario(Boolean tipoDestinatario) {
        this.tipoDestinatario = tipoDestinatario;
    }

    public String getDirrecionDestinatario() {
        return dirrecionDestinatario;
    }

    public void setDirrecionDestinatario(String dirrecionDestinatario) {
        this.dirrecionDestinatario = dirrecionDestinatario;
    }

    public String getTelefonoDestinatar() {
        return telefonoDestinatar;
    }

    public void setTelefonoDestinatar(String telefonoDestinatar) {
        this.telefonoDestinatar = telefonoDestinatar;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
