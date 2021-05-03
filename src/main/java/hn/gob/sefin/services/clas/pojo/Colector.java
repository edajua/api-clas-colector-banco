package hn.gob.sefin.services.clas.pojo;

import java.util.List;

public class Colector {
    private Integer codigo;
    private List<Contacto> contacto;
    private String creadoPor;
    private String direccion;
    private Integer estado;
    private String modificadoPor;
    private String nombre;
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public List<Contacto> getContacto() {
        return contacto;
    }
    public void setContacto(List<Contacto> contacto) {
        this.contacto = contacto;
    }
    public String getCreadoPor() {
        return creadoPor;
    }
    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public String getModificadoPor() {
        return modificadoPor;
    }
    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
