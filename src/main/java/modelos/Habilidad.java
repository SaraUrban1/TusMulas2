package modelos;

import java.util.Objects;

public class Habilidad {
    private Integer id;
    private String nombre;
    private Double dañoBase;
    private Double daño;
    private Double costeMana;
    private TipoHabilidad tipoHabilidad;

    public Habilidad() {
    }

    public Habilidad(Integer id, String nombre, Double dañoBase, Double daño, Double costeMana, TipoHabilidad tipoHabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.dañoBase = dañoBase;
        this.daño = daño;
        this.costeMana = costeMana;
        this.tipoHabilidad = tipoHabilidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDañoBase() {
        return dañoBase;
    }

    public void setDañoBase(Double dañoBase) {
        this.dañoBase = dañoBase;
    }

    public Double getDaño() {
        return daño;
    }

    public void setDaño(Double daño) {
        this.daño = daño;
    }

    public Double getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(Double costeMana) {
        this.costeMana = costeMana;
    }

    public TipoHabilidad getTipoHabilidad() {
        return tipoHabilidad;
    }

    public void setTipoHabilidad(TipoHabilidad tipoHabilidad) {
        this.tipoHabilidad = tipoHabilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return Objects.equals(id, habilidad.id) && Objects.equals(nombre, habilidad.nombre) && Objects.equals(dañoBase, habilidad.dañoBase) && Objects.equals(daño, habilidad.daño) && Objects.equals(costeMana, habilidad.costeMana) && tipoHabilidad == habilidad.tipoHabilidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, dañoBase, daño, costeMana, tipoHabilidad);
    }

    @Override
    public String toString() {
        return "Habilidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dañoBase=" + dañoBase +
                ", daño=" + daño +
                ", costeMana=" + costeMana +
                ", tipoHabilidad=" + tipoHabilidad +
                '}';
    }
}
